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
    public void draw(GraphicsContext grC, Canvas canvas,  double widht_border, double pointX, double pointY, double vel) {
        x_cords = new double[5];
        y_cords = new double[5];
        pointX += 50;
        pointY += 50;

        for (int i = 0; i < 5; ++i) {
            x_cords[i] = (pointX * Math.cos(2 * Math.PI * i / 6) + canvas.getHeight() / 2); // 150
            y_cords[i] = (pointX * Math.sin(2 * Math.PI * i / 6) + canvas.getWidth() / 2);
        }
        grC.setFill(color);
        grC.fillPolygon(x_cords, y_cords, x_cords.length);

        x_cords_border = new double[5];
        y_cords_border = new double[5];
        for (int i = 0; i < 5; ++i) {
            x_cords_border[i] = ((pointX - widht_border) * Math.cos(2 * Math.PI * i / 6) + canvas.getHeight() / 2);
            y_cords_border[i] = ((pointX - widht_border) * Math.sin(2 * Math.PI * i / 6) + canvas.getWidth() / 2);
        }
        //grC.setFill(Color.BLACK);
        grC.setFill(colorPicker);
        grC.fillPolygon(x_cords_border, y_cords_border, x_cords_border.length);
    }

    @Override
    public double square() {
        return (x_cords.length * (x_cords[0] * y_cords[0])) / (4.0 * Math.tan((Math.PI / x_cords.length)));
    }
    public String toString(){
        return "Многоугольник";
    }

    public SixSidex(Color color) { // calling Shape constructor
        super(color);
    }
}
