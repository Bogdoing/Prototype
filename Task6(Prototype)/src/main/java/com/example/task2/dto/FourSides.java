package com.example.task2.dto;

import com.example.task2.model.Shape;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FourSides extends Shape {
    private double width = 50;
    private double height = 50;

    public FourSides(Color color) {
        super(color);
    }

    @Override
    public void draw(GraphicsContext grC, Canvas canvas, double widht_border, double pointX, double pointY, double vel) {
        width = width * (0.1 + (vel / 10));
        height = height * (0.1 + (vel / 10));

        grC.setFill(color);
        grC.fillRect(pointX, pointY, width, height);
        grC.setFill(colorPicker);
        grC.fillRect(pointX + (widht_border / 2), pointY + (widht_border / 2), width - widht_border, height - widht_border);
    }

    @Override
    public double square() {
        return width * height;
    }

    public String toString() {
        return "КВАДРАТ";
    }
}
