package com.example;

import java.io.IOException;
import java.util.Date;

import com.example._core.Data;
import com.example._enums.Priority;
import com.example._enums.Status;
import com.example._models.DashboardTask;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        scene = new Scene(loadFXML("/com/example/primary.fxml"));
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    private static Parent loadFXML(String resourcePath) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(resourcePath));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {

       

        DashboardTask test = new DashboardTask(
                "Clean room",
                "Clean the room and organize the desk",
                new Date(),
                1,
                2,
                Priority.HIGH,
                Status.TODO
        );

        DashboardTask test2 = new DashboardTask(
                "Feed the dogs",
                "Feed the dogs and walk them",
                new Date(),
                2,
                3,
                Priority.LOW,
                Status.INPROGRESS
        );

         DashboardTask test3 = new DashboardTask(
                "Wash the dishes",
                "Wash the dishes and put them away",
                new Date(),
                3,
                4,
                Priority.MEDIUM,
                Status.COMPLETED
        );

         DashboardTask test4 = new DashboardTask(
                "Do investigation homework",
                "Do investigation homework and submit it",
                new Date(),
                3,
                4,
                Priority.MEDIUM,
                Status.TODO
        );

        Data.tasks.add(test);
        Data.tasks.add(test2);
        Data.tasks.add(test3);
        Data.tasks.add(test4);


         launch();

    }

}
