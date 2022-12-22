package com.example.task2.dto;

import com.example.task2.model.Shape;

public class ShapeF {
    public Shape getShape(String shapeString){
        Shape shape = null;
        switch (shapeString){
            case "1":
                shape = new SixSidex();
                System.out.println("SixSidex");
                break;
            case "2":
                shape = new FourSides();
                System.out.println("FourSides");
                break;
            case "3":
                shape = new OvalSides();
                System.out.println("OvalSides");
                break;
            case "4":
                shape = new FourSidesBorder();
                System.out.println("FourSidesBorder");
                break;
        }
        return shape;
    }
}
