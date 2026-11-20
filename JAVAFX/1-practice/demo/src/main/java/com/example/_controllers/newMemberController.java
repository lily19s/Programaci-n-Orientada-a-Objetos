package com.example._controllers;

import java.util.Optional;

import com.example._core.Data;
import com.example._models.TeamMember;
import com.example.mainController;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class newMemberController {

    @FXML
    private Label formTitle;
    @FXML
    private TextField nameField, emailField;
    @FXML
    private ComboBox<String> roleBox;
    @FXML
    private Button deleteButton;

   
    private TeamMember editMember;

    @FXML
    private void initialize() {
        roleBox.getItems().addAll("Líder de proyecto", "Desarrollador", "Diseñador", "QA / Pruebas", "Analista");

        deleteButton.setVisible(false);
        deleteButton.setManaged(false);
    }

    public void setMember(TeamMember member) {
        this.editMember = member;

        formTitle.setText("Editar miembro");
        nameField.setText(member.getName());
        emailField.setText(member.getEmail());
        roleBox.setValue(member.getRole());

        deleteButton.setVisible(true);
        deleteButton.setManaged(true);
    }

    @FXML
    private void save() {
        if (!validate()) {
            return;
        }

        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String role = roleBox.getValue();

        if (editMember == null) {
            Data.members.add(new TeamMember(role, name, email));
        } else {
            
            editMember.setName(name);
            editMember.setEmail(email);
            editMember.setRole(role);
        }

        goBack();
    }

    @FXML
    private void cancel() {
        goBack();
    }

    @FXML
    private void delete() {
        if (editMember == null) {
            return;
        }

        int total = Data.countTasksOf(editMember);

        Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
        confirm.setTitle("Eliminar miembro");
        confirm.setHeaderText("¿Estás seguro de eliminar a este miembro?");
        confirm.setContentText(editMember.getName() + " tiene " + total
                + " tarea(s) asignada(s). Las tareas se conservarán sin responsable.");

        Optional<ButtonType> result = confirm.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            Data.removeMember(editMember);
            goBack();
        }
    }

    private boolean validate() {
        String errors = "";

        String name = nameField.getText() == null ? "" : nameField.getText().trim();
        String email = emailField.getText() == null ? "" : emailField.getText().trim();

        if (name.isEmpty()) {
            errors += "- El nombre es obligatorio.\n";
        } else if (name.length() > 60) {
            errors += "- El nombre no puede pasar de 60 caracteres.\n";
        }

        if (email.isEmpty()) {
            errors += "- El correo electrónico es obligatorio.\n";
        } else if (!email.contains("@") || !email.contains(".") || email.contains(" ")) {
            errors += "- El correo electrónico no es válido.\n";
        } else if (Data.emailExists(email, editMember)) {
            errors += "- Ya existe un miembro con ese correo.\n";
        }

        if (roleBox.getValue() == null) {
            errors += "- Selecciona un rol.\n";
        }

        if (!errors.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Datos incompletos");
            alert.setHeaderText("Revisa los datos del miembro");
            alert.setContentText(errors);
            alert.showAndWait();
            return false;
        }

        return true;
    }

    private void goBack() {
        mainController.instance.showTeam();
    }
}