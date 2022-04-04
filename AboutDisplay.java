import java.awt.*;
import java.util.Random;

public class AboutDisplay extends Canvas {
    public void paint(Graphics g) {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("Background/AboutDisplay.png");
        Image j=t.getImage("Background/arrow.gif");
//        Image[] stage=new Image[8];
//        for (int j = 0; j < 8; j++) {
//            stage[j]=t.getImage("Asset/"+(j+1)+".gif");
//        }

        g.drawImage(i, 0,0,this);
        g.drawImage(j, 35, 418,this);
        //g.drawImage(stage[0].getScaledInstance(100,50,2),0,0,this);
    }
}
