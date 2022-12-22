package com.example.task2.dto;

import com.example.task2.HelloController;
import com.example.task2.model.Shape;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.transform.Affine;

public class OvalSides extends Shape {

    private final double width = 50;
    private final double height = 60;
    @Override
    public void draw(GraphicsContext grC, Color color, Color color_border, double widht_border) {
        grC.setFill(color);
        grC.fillOval(30, 40, width, height);
        grC.setStroke(color_border);
        grC.strokeOval(30+(widht_border/2), 40+(widht_border/2), width-widht_border, height-widht_border);
        /*
        grC.setFill(color_border);
        grC.fillOval(30+(widht_border/2), 40+(widht_border/2), width-widht_border, height-widht_border);
/*
        grC.save();
        //
        Affine transform = grC.getTransform();
        transform.appendTranslation(canvas.getWidth() + offsetX, canvas.getHeight() + offsetY);
        grC.setTransform(transform);
        */
    }

    @Override
    public double square() {
        return  Math.PI * width * height;
    }
}
