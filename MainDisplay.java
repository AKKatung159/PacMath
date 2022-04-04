import java.awt.*;

public class MainDisplay extends Canvas {
    public void paint(Graphics g) {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image k=t.getImage("Background/bgb.png");
        Image i=t.getImage("Background/Background.gif");
        Image j=t.getImage("Background/arrow.gif");
        g.drawImage(k, 0,0,this);
        g.drawImage(i, 0,0,this);
        g.drawImage(j, MainKeyListener.getPoint().x, MainKeyListener.getPoint().y,this);
    }
}
