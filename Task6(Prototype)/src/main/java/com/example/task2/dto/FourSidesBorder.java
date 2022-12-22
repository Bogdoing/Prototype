package com.example.task2.dto;

import com.example.task2.model.Shape;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import com.example.task2.model.Shape;

public class FourSidesBorder extends Shape {
    private double width = 70;
    private double height = 70;

    @Override
    public void draw(GraphicsContext grC, Canvas canvas, double widht_border, double pointX, double pointY, double vel) {
        width = width * (0.1 + (vel / 10));
        height = height * (0.1 + (vel / 10));

        System.out.println("MODEL TEST = " + color);
        System.out.println("MODEL TEST = " + colorPicker);

        grC.setFill(color);
        grC.fillRoundRect(pointX, pointY, width, height, 20, 20);
        grC.setFill(colorPicker);
        grC.fillRoundRect(pointX + (widht_border / 2), pointY + (widht_border / 2),
                width - widht_border, height - widht_border, 20, 20);
    }

    @Override
    public double square() {
        return width * height;
    }

    public String toString() {
        return "Прямоугольник(скруглёный)";
    }
    public FourSidesBorder(Color colorPicker) { // calling Shape constructor
        super(colorPicker);
    }
}
