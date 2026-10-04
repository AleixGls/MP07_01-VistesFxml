package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerVistaB {

    @FXML
    private Label lblSaludo;

    @FXML
    public void ponerSaludo() {
        lblSaludo.setText("Hola " + Main.nom + ", tens " + Main.edat + " anys!");
    }

    @FXML
    private void volver() {
        UtilsViews.setView("VistaA");
    }
}
