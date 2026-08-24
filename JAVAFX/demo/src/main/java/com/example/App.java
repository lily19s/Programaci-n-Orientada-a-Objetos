package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        // Labels
        Label lblHelloWorld = new Label("Hello World");
        Label lblSubtitle = new Label("Please click on the button");
        Label lblTmp = new Label();

        // TextFields
        TextField field = new TextField("Default Text");

        // Buttons
        Button btn = new Button("Click Me");
        btn.setOnAction(event -> {
            String text = field.getText();
            lblTmp.setText(text);
        });

        VBox root = new VBox(20, lblHelloWorld);
        root.getChildren().add(lblSubtitle);
        root.getChildren().add(lblTmp);
        root.getChildren().add(field);
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 500, 300);

        stage.setTitle("My First JAVA FX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}