import java.awt.*;

public class AboutDisplay extends Canvas {
    public void paint(Graphics g) {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("Background/GameDisplay.png");
        g.drawImage(i, 0,0,this);
    }
}
