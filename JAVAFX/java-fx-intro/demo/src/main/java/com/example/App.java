package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;


public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {

        // Title
        HBox title = new HBox(10);
        Label lbl = new Label("Add User");
        title.getChildren().addAll(lbl);

        // Form
        GridPane form = new GridPane();
        form.setHgap(20);
        form.setVgap(10);

        form.add(new Label("Name: "), 0, 0);
        form.add(new TextField(), 1, 0);

        form.add(new Label("Email: "), 0, 1);
        form.add(new TextField(), 1, 1);

        form.add(new Label("Age: "), 0, 2);
        form.add(new TextField(), 1, 2);

        // Buttons
        HBox secButtons = new HBox(10);
        Button btnCancel = new Button("Cancel");
        Button btnSave = new Button("Save");
        secButtons.getChildren().addAll(btnCancel, btnSave);

        BorderPane layout = new BorderPane();
        layout.setTop(title);
        layout.setCenter(form);
        layout.setBottom(secButtons);
        secButtons.setAlignment(Pos.BOTTOM_RIGHT);
        title.setAlignment(Pos.CENTER);

        scene = new Scene(layout, 500, 400);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}