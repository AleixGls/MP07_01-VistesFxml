package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerVistaA {

    @FXML 
    private TextField txtNombre;

    @FXML 
    private TextField txtEdad;

    @FXML
    private Button btnContinuar;
    
    @FXML
    private void initialize() {
        // Evitar poner numeros en el campo de nombre
        txtNombre.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("[a-zA-ZÀ-ÿ ]*")) {
                txtNombre.setText(newValue.replaceAll("[^a-zA-ZÀ-ÿ ]", ""));
            }
        });

        // Evitar poner letras en el campo de la edad
        txtEdad.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                txtEdad.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });

        // Desactivar boton si no hay nombre o edad
        btnContinuar.disableProperty().bind(
            txtNombre.textProperty().isEmpty().or(txtEdad.textProperty().isEmpty())
        );
    }

    @FXML
    private void continuar() {
        Main.nom = txtNombre.getText();
        Main.edat = txtEdad.getText();

        ControllerVistaB cntrlB = (ControllerVistaB) UtilsViews.getController("VistaB");

        cntrlB.ponerSaludo();
        
        UtilsViews.setView("VistaB");
    }
}