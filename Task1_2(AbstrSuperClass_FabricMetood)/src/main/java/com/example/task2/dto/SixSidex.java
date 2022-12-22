package com.example.task2.dto;


import com.example.task2.model.Shape;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SixSidex extends Shape {
    private double[] x_cords;
    private double[] y_cords;
    private double[] x_cords_border;
    private double[] y_cords_border;

    @Override
    public void draw(GraphicsContext grC, Canvas canvas, Color color, Color color_border, double widht_border) {
        x_cords = new double[5];
        y_cords = new double[5];
        for (int i = 0; i < 5; ++i) {
            x_cords[i] = (150 * Math.cos(2 * Math.PI * i / 6) + canvas.getHeight() / 2);
            y_cords[i] = (150 * Math.sin(2 * Math.PI * i / 6) + canvas.getWidth() / 2);
        }
        grC.setFill(color);
        grC.fillPolygon(x_cords, y_cords, x_cords.length);

        x_cords_border = new double[5];
        y_cords_border = new double[5];
        for (int i = 0; i < 5; ++i) {
            x_cords_border[i] = ((150 - widht_border) * Math.cos(2 * Math.PI * i / 6) + canvas.getHeight() / 2);
            y_cords_border[i] = ((150 - widht_border) * Math.sin(2 * Math.PI * i / 6) + canvas.getWidth() / 2);
        }
        //grC.setFill(Color.BLACK);
        grC.setFill(color_border);
        grC.fillPolygon(x_cords_border, y_cords_border, x_cords_border.length);
    }

    @Override
    public double square() {
        return (x_cords.length * (x_cords[0] * y_cords[0])) / (4.0 * Math.tan((Math.PI / x_cords.length)));
    }
}
