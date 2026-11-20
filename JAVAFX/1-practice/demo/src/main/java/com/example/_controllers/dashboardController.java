package com.example._controllers;

import java.io.IOException;

import com.example._core.Data;
import com.example._enums.Status;
import com.example._models.DashboardTask;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.VBox;

public class dashboardController {

    @FXML
    private VBox containerTodo, containerInProgress, containerCompleted;

    @FXML
    private Label totalTodo, totalInProgress, totalCompleted;

    @FXML
    private void initialize() {

        setupDropTarget(containerTodo, Status.TODO);
        setupDropTarget(containerInProgress, Status.INPROGRESS);
        setupDropTarget(containerCompleted, Status.COMPLETED);

        buildCards();
    }

    private void buildCards() {

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

                controller.setTaskInfo(task);

                setupDragSource(card, task);

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

    private void setupDragSource(VBox card, DashboardTask task) {

        card.setOnDragDetected(event -> {
            Dragboard db = card.startDragAndDrop(TransferMode.MOVE);

            ClipboardContent content = new ClipboardContent();
            content.putString(String.valueOf(Data.tasks.indexOf(task)));
            db.setContent(content);

            db.setDragView(card.snapshot(null, null));

            card.setOpacity(0.4);
            event.consume();
        });

        card.setOnDragDone(event -> {
            card.setOpacity(1);
            event.consume();
        });
    }

    private void setupDropTarget(VBox container, Status status) {

        Node column = container.getParent();

        column.setOnDragOver(event -> {
            if (event.getGestureSource() != null && event.getDragboard().hasString()) {
                event.acceptTransferModes(TransferMode.MOVE);
            }
            event.consume();
        });

        column.setOnDragEntered(event -> {
            if (event.getGestureSource() != null && event.getDragboard().hasString()) {
                container.setStyle("-fx-background-color: rgba(37, 99, 235, 0.08); -fx-background-radius: 12px;");
            }
            event.consume();
        });

        column.setOnDragExited(event -> {
            container.setStyle(null);
            event.consume();
        });

        column.setOnDragDropped(event -> {
            Dragboard db = event.getDragboard();
            boolean success = false;

            if (db.hasString()) {
                try {
                    int index = Integer.parseInt(db.getString());
                    DashboardTask task = Data.tasks.get(index);

                    task.setStatus(status);
                    success = true;

                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }

            event.setDropCompleted(success);
            event.consume();

            if (success) {
                container.setStyle(null);

                Platform.runLater(this::buildCards);
            }
        });
    }
}
