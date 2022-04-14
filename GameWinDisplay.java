import java.awt.*;

public class GameWinDisplay extends Canvas {
    public void paint(Graphics g) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Image aboutDisplay = toolkit.getImage("Background/GameWinDisplay.gif");
        Image arrow = toolkit.getImage("Background/arrow.gif");

        g.setFont(new Font("Emulogic", 1, 14));
        g.setColor(new Color(164,200,255));
        g.drawImage(aboutDisplay, 0, 0, this);
        g.drawImage(arrow,GameWinKeyListener.getPoint().x,GameWinKeyListener.getPoint().y, 20, 20, this);
        g.drawString("score 570",300,200);
    }
}
//250 385
//250 305