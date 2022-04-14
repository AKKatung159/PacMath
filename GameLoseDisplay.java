import java.awt.*;

public class GameLoseDisplay extends Canvas {
    public void paint(Graphics g) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Image aboutDisplay = toolkit.getImage("Background/GameLoseDisplay.gif");
        Image arrow = toolkit.getImage("Background/arrow.gif");

        g.drawImage(aboutDisplay, 0, 0, this);
        g.drawImage(arrow,GameLoseKeyListener.getPoint().x,GameLoseKeyListener.getPoint().y, 20, 20, this);
    }
}
