import java.awt.*;

public class MainDisplay extends Canvas {
    public void paint(Graphics g) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Image BackGroundBlack = toolkit.getImage("Background/bgb.png");
        Image Background = toolkit.getImage("Background/Background.gif");
        Image arrow = toolkit.getImage("Background/arrow.gif");

        g.drawImage(BackGroundBlack, 0, 0, this);
        g.drawImage(Background, 0, 0, this);
        g.drawImage(arrow, MainKeyListener.getPoint().x, MainKeyListener.getPoint().y, this);
    }
}