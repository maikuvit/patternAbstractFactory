package Factories;

import Products.Circles.GreenCircle;
import Products.Circles._Circle;
import Products.Lines.GreenLine;
import Products.Lines._Line;
import Products.Rectangles.GreenRectangle;
import Products.Rectangles._Rectangle;

public class GreenShapeFactory implements AbstractFactory{
    @Override
    public _Circle drawCircle() {
        return new GreenCircle();
    }

    @Override
    public _Line drawLine() {
        return new GreenLine();
    }

    @Override
    public _Rectangle drawRectangle() {
        return new GreenRectangle();
    }
}
