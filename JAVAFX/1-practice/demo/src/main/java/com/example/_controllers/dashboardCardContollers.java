package com.example._controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.example._enums.Status;
import javafx.application.Platform;
import javafx.scene.control.ComboBox;
import com.example._models.DashboardTask;
import com.example.mainController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class dashboardCardContollers {

    @FXML
    private Label title, description, date, priority;

    @FXML
    private Label assigneeAvatar, assigneeName;

     @FXML
    private ComboBox<Status> statusBox;

    private DashboardTask task;

    @FXML 
     
    private void initialize(){
        statusBox.getItems().setAll(Status.values());
        statusBox.setOnMouseClicked (e -> e.consume());
    }

    public void setTaskInfo(DashboardTask task) {

        this.task = task;

        statusBox.setValue(task.getStatus());

       
        if (task.getAssignee() == null) {
            assigneeAvatar.setText("?");
            assigneeName.setText("Sin asignar");
            assigneeAvatar.getStyleClass().add("unassigned");
            assigneeName.getStyleClass().add("unassigned");
        } else {
            assigneeAvatar.setText(task.getAssignee().getInitials());
            assigneeName.setText(task.getAssignee().getName());
        }

        this.title.setText(task.getTitle());
        this.description.setText(task.getDescription());

        Date taskDate = task.getDate();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.date.setText(formatter.format(taskDate));

        switch (task.getPriority()) {
            case HIGH:
                this.priority.setText("Alta");
                this.priority.getStyleClass().add("high");
                break;

            case MEDIUM:
                this.priority.setText("Media");
                this.priority.getStyleClass().add("medium");
                break;

            case LOW:
                this.priority.setText("Baja");
                this.priority.getStyleClass().add("low");
                break;

            default:
                this.priority.getStyleClass().add("priority");
                break;
        }
    }

    
    @FXML
    private void editTask() {
        mainController.instance.showEditTask(task);
    }

    @FXML
    private void changeStatus() {
        Status newStatus = statusBox.getValue();

         if (task == null || newStatus == null || newStatus == task.getStatus()) {
            return;
        }

        task.setStatus(newStatus);

         Platform.runLater(() -> mainController.instance.showDashboard());
    }
}