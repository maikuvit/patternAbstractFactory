package Factories;

import Products.Circles.OrangeCircle;
import Products.Circles._Circle;
import Products.Lines.OrangeLine;
import Products.Lines._Line;
import Products.Rectangles.OrangeRectangle;
import Products.Rectangles._Rectangle;

public class OrangeShapeFactory implements AbstractFactory{
    @Override
    public _Circle drawCircle() {
        return new OrangeCircle();
    }

    @Override
    public _Line drawLine() {
        return new OrangeLine();
    }

    @Override
    public _Rectangle drawRectangle() {
        return new OrangeRectangle();
    }
}
