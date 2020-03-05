package com.mycompany.arkanoiddos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    int Scene_Width = 340;
    int Scene_Height = 420;
    
    
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        var scene = new Scene(root, Scene_Width, Scene_Height);
        stage.setScene(scene);
        stage.show();
        
        Tablero tablero = new Tablero();
        root.getChildren().add(tablero);
        
        Pelota pelota1 = new Pelota(1);
        pelota1.setLayoutX(280);
        pelota1.setLayoutY(100);
        root.getChildren().add(pelota1);
        
        Pelota pelota2 = new Pelota(2);
        pelota2.setLayoutX(50);
        pelota2.setLayoutY(50);
        root.getChildren().add(pelota2);
        
        Control control = new Control();
        root.getChildren().add(control);
        
        
        
        
    }

    public static void main(String[] args) {
        launch();
    }

}