/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arkanoiddos;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Javier
 */
public class Pelota extends Group{
    
    public Pelota(int ball) {
        Circle pelota1 = new Circle();
        pelota1.setRadius(7);  
        pelota1.setFill(Color.RED);
        this.getChildren().add(pelota1);
        
        Circle pelota2 = new Circle();
        pelota2.setRadius(7);  
        pelota2.setFill(Color.BLUE);
        this.getChildren().add(pelota2);
    }
}
