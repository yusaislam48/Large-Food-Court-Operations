package com.oop.finalproject.largefoodcourtoperations;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class TestContoller
{
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void onClick(ActionEvent actionEvent) {
        label.setText("Yusa Islam");
    }
}