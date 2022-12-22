package com.example.task2;

import com.example.task2.dto.*;
import com.example.task2.model.Shape;
import javafx.animation.AnimationTimer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.util.Callback;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TextField textField;
    @FXML
    private TextField VelShapeTextF;
    @FXML
    private Canvas canvas = new Canvas(300, 300);
    @FXML
    private Canvas canvasMouse = new Canvas(300, 300);
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private ColorPicker colorPickerBorder;
    @FXML
    private ListView listview;
    private ObservableList<Shape> content;
    private GraphicsContext grC;
    private Shape shape;

    @FXML
    protected void delete() {
        grC.clearRect(0, 0, 700, 800);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        OvalSides oval = new OvalSides(Color.RED);
        FourSides fourSides = new FourSides(Color.RED);
        FourSidesBorder fourSidesBorder = new FourSidesBorder(Color.RED);
        SixSidex sixSidex = new SixSidex(Color.RED);
        content = FXCollections.observableArrayList(oval, fourSides, fourSidesBorder, sixSidex);
        listview.setItems(content);
        listview.setCellFactory(new Callback<ListView<Shape>, ListCell<Shape>>() {
                                    @Override
                                    public ListCell<Shape> call(ListView<Shape> list) {
                                        return new ShapeShell();
                                    }
                                }
        );
        listview.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
    @FXML
    protected void onMousePressed(MouseEvent mouseEvent) {

        int index = listview.getSelectionModel().getSelectedIndex(); //получение индекса выбора из списка
        Color color = colorPicker.getValue();
        Color color_border = colorPickerBorder.getValue();
        System.out.println("New Color's RGB = " + color.getRed() + " " + color.getGreen() + " " + color.getBlue());

        String textborder = textField.getText();
        int text_border = Integer.parseInt(textborder);
        String textvel = VelShapeTextF.getText();
        double text_vel = Double.parseDouble(textvel);
        System.out.println("Text = " + textborder + "  " + "Text int = " + textborder);
        System.out.println("Text = " + textvel + "  " + "Text int = " + textvel);

        System.out.println(index);
        ShapeF shapeF = new ShapeF();
        shapeF.getShapeInt(index);

        shape = (Shape) content.get(index).clone();// создание копии фигуры

        shape.setColor(colorPickerBorder.getValue());
        System.out.println(shape.getColor());

        shape.setColorPicker(colorPicker.getValue());
        System.out.println(shape.getColorPicker());

        grC = canvas.getGraphicsContext2D();
        shape.setColor(color);
        shape.setColorPicker(color_border);
        shape.draw(grC, canvas, text_border, mouseEvent.getX(), mouseEvent.getY(), text_vel);
    }
}