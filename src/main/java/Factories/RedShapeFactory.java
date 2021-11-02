package Factories;

import Products.Circles.RedCircle;
import Products.Circles._Circle;
import Products.Lines.RedLine;
import Products.Lines._Line;
import Products.Rectangles.RedRectangle;
import Products.Rectangles._Rectangle;

import javax.swing.*;

public class RedShapeFactory implements AbstractFactory{

    @Override
    public _Circle drawCircle() {
        return new RedCircle();
    }

    @Override
    public _Line drawLine() {
        return new RedLine();
    }

    @Override
    public _Rectangle drawRectangle() {
        return new RedRectangle();
    }
}
