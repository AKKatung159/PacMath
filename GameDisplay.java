import java.awt.*;
import java.util.Random;

public class GameDisplay extends Canvas {
    private int num=0,num2=60;
    public GameDisplay(){
    }
    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("Background/GameDisplay.png");
        Image k = t.getImage("Background/player.gif");
        Image l = t.getImage("Background/Frame 1.png");
        Image r = t.getImage("Background/Frame 2.png");
        if(num>512){
            num=0;
            num2=60;
        }
        num+=10;
        num2+=2;
        Image[] stage = new Image[8];
        for (int j = 0; j < stage.length ; j++) {
            stage[j] = t.getImage("Asset/" + (j+1) + ".gif");
        }
        Random random = new Random();
        //[r.nextInt(8)], 0, 0, this
        g.setFont(new Font("Emulogic", 1, 14));
        g.setColor(Color.cyan);
        //i = i.getScaledInstance(200, 200, Image.SCALE_FAST);
        g.drawImage(i, 0, 0, this);
        //System.out.println("x "+(-(GameLauncher.getMainFrame().getWidth() - stage[0].getWidth(null))/2));
        //System.out.println("y "+(GameLauncher.getMainFrame().getHeight() - stage[0].getHeight(null))/2);
        //System.out.println("width"+EnemyMove.getSizeLength());
        //System.out.println("Hight"+EnemyMove.getSizeHeight());
        g.drawImage(stage[0], (int) ((720 - num2*5.6)/2),num, (int) (num2*5.6),num2,this );//(GameLauncher.getMainFrame().getHeight() - stage[0].getHeight(null))/2
        //g.drawImage(stage[0], EnemyMove.getXmove(), EnemyMove.getYmove(), EnemyMove.getSizeLength(), EnemyMove.getSizeHeight(), this );
        //g.drawImage(k, GameKeyListener.getPoint().x, GameKeyListener.getPoint().y, this); //k
        g.drawString("+30", (int) ((720 -140)/2),num+40);
        g.drawString("-35", (int) ((720 +60)/2),num+40);
        
        g.drawImage(k, GameKeyListener.getPoint().x, GameKeyListener.getPoint().y,40, 40, this); //k
        //g.drawString("Score " + GameKeyListener.getPoint().x, 20, 30);
        g.drawImage(l,0,-4,this);
        g.drawImage(r,GameLauncher.getMainFrame().getWidth()-r.getWidth(null),-4,this);

        g.drawString("SCORE : " + GameKeyListener.getPoint().x, 20, 30);
//       g.drawString("Y : " + GameKeyListener.getPoint().y, 20, 50);
//       g.drawString("Length : " + GameKeyListener.getSize().x, 20, 70);
//       g.drawString("Height : " + GameKeyListener.getSize().y, 20, 90);
//       g.drawImage(m, 0, 0, this);
    }
}