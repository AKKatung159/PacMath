import java.awt.*;

public class MainDisplay extends Canvas {
    public void paint(Graphics g) {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("Background/Background.gif");
        Image j=t.getImage("Background/arrow.gif");
        g.drawImage(i, 0,0,this);
        g.drawImage(j, MyKeyListener.getPoint().x, MyKeyListener.getPoint().y,this);
    }
}
