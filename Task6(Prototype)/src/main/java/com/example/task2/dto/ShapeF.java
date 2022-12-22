package com.example.task2.dto;

import com.example.task2.model.Shape;
import javafx.scene.paint.Color;

public class ShapeF {
    public Shape getShape(String shapeString) {
        Shape shape = null;
        switch (shapeString) {
            case "1":
                shape = new SixSidex(Color.RED);
                System.out.println("SixSidex");
                break;
            case "2":
                shape = new FourSides(Color.RED);
                System.out.println("FourSides");
                break;
            case "3":
                shape = new OvalSides(Color.RED);
                System.out.println("OvalSides");
                break;
            case "4":
                shape = new FourSidesBorder(Color.RED);
                System.out.println("FourSidesBorder");
                break;
        }
        return shape;
    }

    public Shape getShapeInt(int shapeString) {
        Shape shape = null;
        switch (shapeString) {
            case 3:
                shape = new SixSidex(Color.RED);

                System.out.println("SixSidex");
                break;
            case 1:
                shape = new FourSides(Color.RED);
                System.out.println("FourSides");
                break;
            case 0:
                shape = new OvalSides(Color.RED);
                System.out.println("OvalSides");
                break;
            case 2:
                shape = new FourSidesBorder(Color.RED);
                System.out.println("FourSidesBorder");
                break;
        }
        return shape;
    }
}
