package Products.Lines;

import java.awt.*;
import java.awt.geom.Line2D;

public class RedLine extends _Line {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        g.clearRect(0,0,getSize().width,getSize().height);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g2.draw(new Line2D.Float(getSize().width / 4,getSize().height / 4,getSize().width* 3 / 4 ,getSize().height * 3/ 4));
    }
}
