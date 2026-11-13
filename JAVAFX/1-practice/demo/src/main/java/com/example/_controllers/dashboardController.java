package com.example._controllers;

import java.io.IOException;

import com.example._core.Data;
import com.example._models.DashboardTask;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class dashboardController {

    @FXML
    private VBox containerTodo, containerInProgress, containerCompleted;

    @FXML
    private Label totalTodo, totalInProgress, totalCompleted;

    @FXML
    private void initialize() {
        buildCards();
    }

    private  void buildCards() {

        containerTodo.getChildren().clear();
        containerInProgress.getChildren().clear();
        containerCompleted.getChildren().clear();

        for (DashboardTask task : Data.tasks) {
            try {

                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/com/example/dashboardCard.fxml")
                );

                VBox card = loader.load();

                dashboardCardContollers controller = loader.getController();

                controller.setTaskInfo (task);

                switch (task.getStatus()) {

                    case TODO:
                        containerTodo.getChildren().add(card);
                        break;

                    case INPROGRESS:
                        containerInProgress.getChildren().add(card);
                        break;

                    case COMPLETED:
                        containerCompleted.getChildren().add(card);
                        break;
                }

            } catch (IOException e) {

                e.printStackTrace();

            }
        }

        this.totalTodo.setText(String.valueOf(containerTodo.getChildren().size()));
                this.totalInProgress.setText(String.valueOf(containerInProgress.getChildren().size()));
                this.totalCompleted.setText(String.valueOf(containerCompleted.getChildren().size()));

    }
}
