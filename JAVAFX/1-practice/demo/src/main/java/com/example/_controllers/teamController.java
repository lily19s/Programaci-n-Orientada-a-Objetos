package com.example._controllers;

import java.io.IOException;

import com.example._core.Data;
import com.example._models.TeamMember;
import com.example.mainController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class teamController {

    @FXML
    private FlowPane membersContainer;

    @FXML
    private Label totalMembers, emptyLabel;

    @FXML
    private TextField searchField;

    @FXML
    private void initialize() {
       
        searchField.textProperty().addListener((observable, oldText, newText) -> buildCards());

        buildCards();
    }

    private void buildCards() {

        membersContainer.getChildren().clear();

        String search = searchField.getText() == null ? "" : searchField.getText().trim().toLowerCase();
        int shown = 0;

        for (TeamMember member : Data.members) {

            
            if (!search.isEmpty() && !member.getEmail().toLowerCase().contains(search)) {
                continue;
            }

            try {

                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/com/example/memberCard.fxml")
                );

                VBox card = loader.load();

                memberCardController controller = loader.getController();
                controller.setMember(member);

                membersContainer.getChildren().add(card);
                shown++;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        totalMembers.setText(String.valueOf(shown));

       
        boolean empty = (shown == 0);
        if (Data.members.isEmpty()) {
            emptyLabel.setText("Aún no hay miembros registrados.");
        } else {
            emptyLabel.setText("No se encontró ningún miembro con ese correo.");
        }
        emptyLabel.setVisible(empty);
        emptyLabel.setManaged(empty);
    }

    @FXML
    private void showNewMember() {
        mainController.instance.showNewMember();
    }
}