package Products.Circles;

import java.awt.*;

public class OrangeCircle extends _Circle {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.ORANGE);
        g.clearRect(0,0,getSize().width,getSize().height);
        g.fillOval(getSize().width / 4,getSize().height / 4,getSize().width / 2 ,getSize().height / 2);
    }
}
