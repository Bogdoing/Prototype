package com.example.task2.dto;

import com.example.task2.HelloController;
import com.example.task2.model.Shape;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;

public class OvalSides extends Shape {

    private double width = 50;
    private double height = 50;

    @Override
    public void draw(GraphicsContext grC, Canvas canvas, double widht_border, double pointX, double pointY, double vel) {
        width = width * (0.1 + (vel / 10));
        height = height * (0.1 + (vel / 10));

        grC.setFill(color);
        grC.fillOval(pointX, pointY, width, height);
        grC.setStroke(colorPicker);
        grC.strokeOval(pointX + (widht_border / 2), pointY + (widht_border / 2), width - widht_border, height - widht_border);
    }

    @Override
    public double square() {
        return Math.PI * width * height;
    }

    public String toString() {
        return "ОВАЛ " + color;
    }
    public OvalSides(Color color) { // calling Shape constructor
        super(color);
    }
}
