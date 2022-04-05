import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class GameDisplay extends Canvas {
    public void paint(Graphics g) {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("Background/GameDisplay.png");
        Image k=t.getImage("Background/player.gif");
        //BufferedImage m=new BufferedImage(k.getWidth(null),k.getHeight(null),BufferedImage.TYPE_INT_RGB);
`       
        Image[] stage=new Image[8];
        for (int j = 0; j < 8; j++) {
            stage[j]=t.getImage("Asset/"+(j+1)+".gif");
        }
        Random r=new Random();
        //[r.nextInt(8)],0,0,this
        g.setFont(new Font("Emulogic",1,14));
        g.setColor(Color.cyan);
        g.drawImage(i,0,0,this);
        g.drawImage(k,GameKeyListener.getPoint().x,GameKeyListener.getPoint().y,this);
        g.drawString("Score "+GameKeyListener.getPoint().x,20,30);
        //g.drawImage(m,0,0,this);
    }
}
