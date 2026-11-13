package com.example._controllers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

import com.example._core.Data;
import com.example._enums.Priority;
import com.example._enums.Status;
import com.example._models.DashboardTask;
import com.example.mainController;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class newTaskController {

    @FXML
    private Label formTitle;
    @FXML
    private TextField titleField;
    @FXML
    private TextArea descriptionField;
    @FXML
    private ComboBox<String> priorityBox;
    @FXML
    private DatePicker datePicker;
    @FXML
    private Button deleteButton;

    private DashboardTask editTask;

    @FXML
    private void initialize() {
        priorityBox.getItems().addAll("Alta", "Media", "Baja");
        priorityBox.setValue("Media");
        datePicker.setValue(LocalDate.now());

        deleteButton.setVisible(false);
        deleteButton.setManaged(false);
    }

    public void setTask(DashboardTask task) {
        this.editTask = task;

        formTitle.setText("Editar tarea");
        titleField.setText(task.getTitle());
        descriptionField.setText(task.getDescription());

        switch (task.getPriority()) {
            case HIGH:
                priorityBox.setValue("Alta");
                break;
            case MEDIUM:
                priorityBox.setValue("Media");
                break;
            default:
                priorityBox.setValue("Baja");
                break;
        }

        LocalDate localDate = task.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        datePicker.setValue(localDate);

        deleteButton.setVisible(true);
        deleteButton.setManaged(true);
    }

    @FXML
    private void save() {
        if (!validate()) {
            return;
        }

        String title = titleField.getText();
        String description = descriptionField.getText();

        Priority priority;
        switch (priorityBox.getValue()) {
            case "Alta":
                priority = Priority.HIGH;
                break;
            case "Media":
                priority = Priority.MEDIUM;
                break;
            default:
                priority = Priority.LOW;
                break;
        }

        Date date = Date.from(datePicker.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant());

        if (editTask == null) {
            
            DashboardTask newTask = new DashboardTask(title, description, date, 0, 0, priority, Status.TODO);
            Data.tasks.add(newTask);
        } 
        else {
            editTask.setTitle(title);
            editTask.setDescription(description);
            editTask.setPriority(priority);
            editTask.setDate(date);
        }

        goBack();
    }

    @FXML
    private void cancel() {
        goBack();
    }

    @FXML
    private void delete() {
        if (editTask == null) {
            return;
        }

        Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
        confirm.setTitle("Eliminar tarea");
        confirm.setHeaderText("¿Estás seguro de eliminar esta tarea?");
        confirm.setContentText(editTask.getTitle());

        Optional<ButtonType> result = confirm.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            Data.tasks.remove(editTask);
            goBack();
        }
    }

    private boolean validate() {
        String errors = "";

        String title = titleField.getText() == null ? "" : titleField.getText().trim();
        String description = descriptionField.getText() == null ? "" : descriptionField.getText().trim();

        if (title.isEmpty()) {
            errors += "- El título es obligatorio.\n";
        } else if (title.length() > 60) {
            errors += "- El título no puede pasar de 60 caracteres.\n";
        }

        if (description.isEmpty()) {
            errors += "- La descripción es obligatoria.\n";
        } else if (description.length() > 200) {
            errors += "- La descripción no puede pasar de 200 caracteres.\n";
        }

        if (priorityBox.getValue() == null) {
            errors += "- Selecciona una prioridad.\n";
        }

        if (datePicker.getValue() == null) {
            errors += "- La fecha límite es obligatoria.\n";
        } else if (editTask == null && datePicker.getValue().isBefore(LocalDate.now())) {
            errors += "- La fecha límite no puede ser anterior a hoy.\n";
        }

        if (!errors.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Datos incompletos");
            alert.setHeaderText("Revisa los datos de la tarea");
            alert.setContentText(errors);
            alert.showAndWait();
            return false;
        }

        return true;
    }

    private void goBack() {
        mainController.instance.showDashboard();
    }
}
