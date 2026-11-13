package com.example._controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.example._models.DashboardTask;
import com.example.mainController;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class dashboardCardContollers {

    @FXML
    private Label title, description, date, priority;

    private DashboardTask task;

    public void setTaskInfo(DashboardTask task) {

        this.task = task;

        this.title.setText(task.getTitle());
        this.description.setText(task.getDescription());

        Date date = task.getDate();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.date.setText(formatter.format(date));

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
}