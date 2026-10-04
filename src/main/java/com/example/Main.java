package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    static String nom;
    static String edat;

    @Override
    public void start(Stage stage) throws Exception {
        UtilsViews.addView(Main.class, "VistaA", "/VistaA.fxml");
        UtilsViews.addView(Main.class, "VistaB", "/VistaB.fxml");

        Scene scene = new Scene(UtilsViews.parentContainer);

        stage.setTitle("Vistes Fxml");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}