/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.firstprojectmaven;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crea i pulsanti
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");

        // Crea un StackPane
        StackPane stackPane = new StackPane();

        // Aggiungi i pulsanti al StackPane
        stackPane.getChildren().addAll(btn1, btn2);

        // Imposta la scena
        Scene scene = new Scene(stackPane, 300, 250);

        // Imposta il titolo della finestra
        primaryStage.setTitle("StackPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
