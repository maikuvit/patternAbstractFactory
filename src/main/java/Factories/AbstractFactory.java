package Factories;

import Products.Circles._Circle;
import Products.Lines._Line;
import Products.Rectangles._Rectangle;

import javax.swing.*;

public interface AbstractFactory {
    _Circle drawCircle();
    _Line drawLine();
    _Rectangle drawRectangle();
}
