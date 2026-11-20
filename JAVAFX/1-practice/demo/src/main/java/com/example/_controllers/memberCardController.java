package com.example._controllers;

import java.util.Optional;

import com.example._core.Data;
import com.example._models.TeamMember;
import com.example.mainController;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

public class memberCardController {

    @FXML
    private Label initials, name, email, role, taskCount;

    private TeamMember member;

    public void setMember(TeamMember member) {
        this.member = member;

        initials.setText(member.getInitials());
        name.setText(member.getName());
        email.setText(member.getEmail());
        role.setText(member.getRole());

        int total = Data.countTasksOf(member);
        taskCount.setText(total == 1 ? "1 tarea" : total + " tareas");
    }

    @FXML
    private void editMember() {
        mainController.instance.showEditMember(member);
    }

    @FXML
    private void deleteMember() {
        int total = Data.countTasksOf(member);

        Alert confirm = new Alert(Alert.AlertType.CONFIRMATION);
        confirm.setTitle("Eliminar miembro");
        confirm.setHeaderText("¿Estás seguro de eliminar a este miembro?");
        confirm.setContentText(member.getName() + " tiene " + total
                + " tarea(s) asignada(s). ");

        Optional<ButtonType> result = confirm.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            Data.removeMember(member);
            mainController.instance.showTeam();
        }
    }
}
