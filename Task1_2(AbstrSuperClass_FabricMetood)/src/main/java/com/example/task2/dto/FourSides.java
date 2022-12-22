package com.example.task2.dto;

import com.example.task2.model.Shape;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FourSides extends Shape {
    private final double width = 50;
    private final double height = 50;

    @Override
    public void draw(GraphicsContext grC, Color color, Color color_border, double widht_border) {
        grC.setFill(color);
        grC.fillRect(200, 40, width, height);
        grC.setFill(color_border);
        grC.fillRect(200 + (widht_border / 2), 40 + (widht_border / 2), width - widht_border, height - widht_border);
    }

    @Override
    public double square() {
        return width * height;
    }
}
