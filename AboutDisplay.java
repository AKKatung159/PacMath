import java.awt.*;

public class AboutDisplay extends Canvas {
    public void paint(Graphics g) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Image aboutDisplay = toolkit.getImage("Background/AboutDisplay.png");
        Image arrow = toolkit.getImage("Background/arrow.gif");

        g.drawImage(aboutDisplay, 0, 0, this);
        g.drawImage(arrow, 35, 418, this);
    }
}
