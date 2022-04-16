import java.awt.*;

public class GameWinDisplay extends Canvas {
    private Color scoreColor = new Color(164,200,255);
    public void paint(Graphics g) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Image aboutDisplay = toolkit.getImage("Background/GameWinDisplay.gif");
        Image arrow = toolkit.getImage("Background/arrow.gif");

        g.setFont(new Font("Emulogic", 1, 14));
        g.setColor(scoreColor);
        g.drawImage(aboutDisplay, 0, 0, this);
        g.drawImage(arrow,GameWinKeyListener.getPoint().x,GameWinKeyListener.getPoint().y, 20, 20, this);
        g.drawString("score "+GameLogic.getScore(),300,200);
    }
}