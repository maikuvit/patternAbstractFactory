package Products.Rectangles;

import Products.Lines._Line;

import java.awt.*;
import java.awt.geom.Line2D;

public class RedRectangle extends _Rectangle {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        g.clearRect(0,0,getSize().width,getSize().height);
        g.fillRect(getSize().width / 4,getSize().height / 4,getSize().width / 2 ,getSize().height / 2);
    }
}
