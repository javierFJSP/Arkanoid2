/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arkanoiddos;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;



/**
 *
 *
 * @author Javier
 */
public class Control extends Pane{

    short palaPosX = 200;
    short palaPosY = 380;
    
    
    // Barra de control
    public Control(int rectangle) {
        Rectangle rectPala = new Rectangle();
        rectPala.setWidth(50);
        rectPala.setHeight(10);
        rectPala.setX(palaPosX);
        rectPala.setY(palaPosY);
        rectPala.setFill(Color.GREEN);        
        

        Image control = new Image(getClass().getResourceAsStream("/imagenes/barracontrol.png"));
        ImageView imageView1 = new ImageView(control);
        

        Group groupcontrol = new Group();
        groupcontrol.getChildren().add(rectPala);
        groupcontrol.getChildren().add(imageView1);

        
    }

}


