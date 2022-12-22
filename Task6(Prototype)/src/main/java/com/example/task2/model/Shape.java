package com.example.task2.model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public abstract class Shape implements Cloneable {
    protected Color color;
    protected Color colorPicker;
    private double height;
    private double weight;
    private double square;
    public void draw(GraphicsContext grC, Canvas canvas, double widht_border, double pointX, double pointY, double vel) {};

    public double square() {
        return square;
    };

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void setColorPicker(Color colorPicker) {
        this.colorPicker = colorPicker;
    }
    public Color getColorPicker() {
        return colorPicker;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
    public Shape(Color color) {
        System.out.println("Shape constructor called");
        this.colorPicker = color;
    }
}
