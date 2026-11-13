package com.example;

import java.io.IOException;

import com.example._controllers.newTaskController;
import com.example._models.DashboardTask;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class mainController {

    public static mainController instance;

    @FXML
    private StackPane mainContainer;

    @FXML
    private void initialize() {
        instance = this;
        laodView("/com/example/Dashboard.fxml");
    }

    @FXML
    public void showMyTasks() {
        laodView("/com/example/MyTasks.fxml");
    }

    @FXML
    void showCalendar() {
        laodView("/com/example/Calendar.fxml");
    }

    @FXML
    void showSettings() {
        laodView("/com/example/Settings.fxml");
    }

    @FXML
    void showTeam() {
        laodView("/com/example/Team.fxml");
    }

    @FXML
    public void showDashboard() {
        laodView("/com/example/Dashboard.fxml");
    }

    @FXML
    void showNewTask() {
        laodView("/com/example/newTask.fxml");
    }

    
    public void showEditTask(DashboardTask task) {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/newTask.fxml"));

            Parent view = loader.load();

            newTaskController controller = loader.getController();
            controller.setTask(task);

            mainContainer.getChildren().setAll(view);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void laodView(String taskView) {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(taskView));

            Parent view = loader.load();

            mainContainer.getChildren().setAll(view);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
