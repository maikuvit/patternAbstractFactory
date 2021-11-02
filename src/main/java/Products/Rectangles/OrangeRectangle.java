package Products.Rectangles;

import java.awt.*;

public class OrangeRectangle extends _Rectangle {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.ORANGE);
        g.clearRect(0,0,getSize().width,getSize().height);
        g.fillRect(getSize().width / 4,getSize().height / 4,getSize().width / 2 ,getSize().height / 2);
    }
}
