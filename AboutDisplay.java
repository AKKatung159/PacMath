import java.awt.*;
import java.util.Random;

public class AboutDisplay extends Canvas {
    public void paint(Graphics g) {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("Background/AboutDisplay.png");
        Image j=t.getImage("Background/arrow.gif");

        g.drawImage(i, 0,0,this);
        g.drawImage(j, 35, 418,this);
    }
}
