package com.example.task2.dto;

import com.example.task2.model.Shape;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import com.example.task2.model.Shape;

public class FourSidesBorder extends Shape {
    private final double width = 70;
    private final double height = 70;

    @Override
    public void draw(GraphicsContext grC, Color color, Color ColorBorder, double widht_border) {
        System.out.println("MODEL TEST = "+ColorBorder.getRed()+" "+ColorBorder.getGreen()+" "+ColorBorder.getBlue());
        System.out.println("MODEL TEST = "+ color);
        System.out.println("MODEL TEST = "+ ColorBorder);

        grC.setFill(color);
        grC.fillRoundRect(110, 100, width, height, 20, 20);
        grC.setFill(ColorBorder);

        grC.fillRoundRect(110+(widht_border/2), 100+(widht_border/2),
                          width-widht_border, height-widht_border,20, 20);
    }

    @Override
    public double square() {
        return width * height;
    }
}
