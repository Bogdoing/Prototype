package com.example.task2;

import com.example.task2.dto.*;
import com.example.task2.model.Shape;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private TextField textField;
    @FXML
    private Canvas canvas = new Canvas(300, 300);
    @FXML
    private Canvas canvasMouse = new Canvas(300, 300);
    @FXML
    private ColorPicker colorPicker = new ColorPicker();
    @FXML
    private ColorPicker colorPickerBorder = new ColorPicker();
    @FXML
    private ChoiceBox choicebox;
    private GraphicsContext grC;
    private Shape shape;

    //double width_border;
    //double offsetX;
    //double offsetY;


    @FXML
    protected void onHelloButtonClick1() {
        Color color = colorPicker.getValue();
        Color color_border = colorPickerBorder.getValue();
        System.out.println("New Color's RGB = " + color.getRed() + " " + color.getGreen() + " " + color.getBlue());

        String text = textField.getText();
        int text_int = Integer.parseInt(text);
        System.out.println("Text = " + text + "  " + "Text int = " + text);


        grC = canvas.getGraphicsContext2D();
        shape = new SixSidex();
        shape.setColor(color);
        //shape.draw(grC, canvas, shape.getColor(), color_border);
        shape.draw(grC, canvas, color, color_border, text_int);
        //textField.setText(String.valueOf(shape.square()));
    }

    @FXML
    protected void onHelloButtonClick2() {
        Color color = colorPicker.getValue();
        Color color_border = colorPickerBorder.getValue();
        System.out.println("New Color's RGB = " + color.getRed() + " " + color.getGreen() + " " + color.getBlue());

        String text = textField.getText();
        int text_border = Integer.parseInt(text);
        System.out.println("Text = " + text + "  " + "Text int = " + text);

        grC = canvas.getGraphicsContext2D();
        shape = new FourSides();
        shape.setColor(color);
        shape.draw(grC, shape.getColor(), color_border, text_border);
        //textField.setText(String.valueOf(shape.square()));
    }

    @FXML
    protected void onHelloButtonClick3() {
        Color color = colorPicker.getValue();
        Color color_border = colorPickerBorder.getValue();
        System.out.println("New Color's RGB = " + color.getRed() + " " + color.getGreen() + " " + color.getBlue());

        String text = textField.getText();
        int text_border = Integer.parseInt(text);
        System.out.println("Text = " + text + "  " + "Text int = " + text);

        grC = canvas.getGraphicsContext2D();
        shape = new OvalSides();
        shape.setColor(color);
        shape.draw(grC, shape.getColor(), color_border, text_border);
        //textField.setText(String.valueOf(shape.square()));
    }

    @FXML
    protected void onHelloButtonClick4() {
        Color color = colorPicker.getValue();
        Color color_border = colorPickerBorder.getValue();
        System.out.println("colorPicker = " + color.getRed() + " " + color.getGreen() + " " + color.getBlue());
        System.out.println("colorPickerFill = " + color_border.getRed() + " " + color_border.getGreen() + " " + color_border.getBlue());

        String text = textField.getText();
        int text_border = Integer.parseInt(text);
        System.out.println("Text = " + text + "  " + "Text int = " + text);

        grC = canvas.getGraphicsContext2D();
        shape = new FourSidesBorder();
        shape.setColor(color);
        shape.draw(grC, shape.getColor(), color_border, text_border);
        //textField.setText(String.valueOf(shape.square()));
    }

    @FXML
    protected void DrawSuperClass() {
        Color color = colorPicker.getValue();
        Color color_border = colorPickerBorder.getValue();
        System.out.println("New Color's RGB = " + color.getRed() + " " + color.getGreen() + " " + color.getBlue());

        String text = textField.getText();
        int text_border = Integer.parseInt(text);
        System.out.println("Text = " + text + "  " + "Text int = " + text);

        String str = choicebox.getValue().toString();
        System.out.println(str);
        switch (str) {
            case "Draw Polygon":
                str = "1";
                break;
            case "Draw Rect":
                str = "2";
                break;
            case "Draw Oval":
                str = "3";
                break;
            case "Draw RoundRect":
                str = "4";
                break;
        }
        ShapeF shapeF = new ShapeF();
        shapeF.getShape(str);

        shape = shapeF.getShape(str);
        grC = canvas.getGraphicsContext2D();
        shape.setColor(color);
        if (shape instanceof SixSidex) {
            shape.draw(grC, canvas, shape.getColor(), color_border, text_border);
        } else {
            shape.draw(grC, shape.getColor(), color_border, text_border);
        }

        //textField.setText(String.valueOf(shape.square()));
    }
    @FXML
    protected void delete() {
        grC.clearRect(0, 0, 700, 800);
    }

        /*
        @FXML
        protected void onMouseDragged(MouseEvent mouseEvent){
            System.out.println("offsetX = "+ offsetX);
            offsetX += mouseEvent.getX() - pressedX;
            offsetY += mouseEvent.getY() - pressedY;
            pressedX = mouseEvent.getX();
            pressedY = mouseEvent.getY();
            shape.draw(grC, shape.getColor(), offsetX, offsetY, canvas);

        }
        double pressedX;
        double pressedY;
        @FXML
        protected void onMousePressed(MouseEvent mouseEvent){
            System.out.println("pressedX = "+ pressedX);
            pressedX = mouseEvent.getX();
            pressedY = mouseEvent.getY();
        }

        @FXML
        protected void mouseClicked(){
            Color c = colorPicker.getValue(); // !!!
            System.out.println("New Color's RGB = "+c.getRed()+" "+c.getGreen()+" "+c.getBlue());

            grC = canvasMouse.getGraphicsContext2D();
            shape = new FourSidesBorder();
            shape.setColor(c);
            shape.draw(grC, shape.getColor());
        }
        @FXML
        protected void canvaseMoveMouse(){
            double x_pos = 150;
            double y_pos = 150;
            Color c = colorPicker.getValue(); // !!!
            //System.out.println("New Color's RGB = "+c.getRed()+" "+c.getGreen()+" "+c.getBlue());

            grC = canvasMouse.getGraphicsContext2D();
            shape = new FourSidesBorder();
            shape.setColor(c);
            //shape.draw(grC, shape.getColor(), x_pos, y_pos);

            canvasMouse.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    System.out.println("mouse click detected! "+event.getSource() + event.getX()+ event.getY());
                    shape.draw(grC, shape.getColor(), event.getX(), event.getY());
                }
            });
        }
        protected double MouseIventgetx(MouseEvent mouseEvent){
            double x = mouseEvent.getX();
            return x;
        }
        protected double MouseIventgety(MouseEvent mouseEvent){
            double y = mouseEvent.getY();
            return y;
        }

    */

}