import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameDisplay extends Canvas {
    private int num=0,num2=60,round=0,size=14,numscore=25,enemy=0;
    private JFrame frame=GameLauncher.getMainFrame();
    private Random random = new Random();
    private static String keyMove="";
    public static String getKeyMove(){
        return keyMove;
    }
    public GameDisplay(){
        new GameLogic();
        GameLogic.setScore(0);
        enemy=EnemyMove.getEnemyPic();
    }

    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("Background/GameDisplay.png");
        Image k = t.getImage("Background/player.gif");
        Image l = t.getImage("Background/Frame 1.png");
        Image r = t.getImage("Background/Frame 2.png");
        if(num>300&&round<=GameLogic.getLap()){
            if(GameKeyListener.getPoint().x>340){
                GameLogic.checkScore("R");
            }
            else if (GameKeyListener.getPoint().x<=340){
                GameLogic.checkScore("L");
            }
            new GameLogic();

            round++;
            num=0;
            num2=60;
            numscore=25;
            size=14;
            //enemy=random.nextInt(8);
            enemy=EnemyMove.getEnemyPic();
        }
        else if(round==GameLogic.getLap()){
            frame.getContentPane().removeAll();
            frame.add(new GameWinDisplay());
            frame.validate();
            frame.removeKeyListener(frame.getKeyListeners()[0]);
            frame.addKeyListener(new GameWinKeyListener());
        }
        else if(GameLogic.getScore()<0){
            frame.getContentPane().removeAll();
            frame.add(new GameLoseDisplay());
            frame.validate();
            frame.removeKeyListener(frame.getKeyListeners()[0]);
            frame.addKeyListener(new GameLoseKeyListener());
        }
        num+=6.25;
        num2+=1.25;
        numscore+=7.75;
        size+=0.5;
        Image[] stage = new Image[8];
        for (int j = 0; j < stage.length ; j++) {
            stage[j] = t.getImage("Asset/" + (j+1) + ".gif");
        }
        //[r.nextInt(8)], 0, 0, this
        g.setFont(new Font("Emulogic", 1, size));
        g.setColor(Color.cyan);
        //i = i.getScaledInstance(200, 200, Image.SCALE_FAST);
        g.drawImage(i, 0, 0, this);
        //System.out.println("x "+(-(GameLauncher.getMainFrame().getWidth() - stage[0].getWidth(null))/2));
        //System.out.println("y "+(GameLauncher.getMainFrame().getHeight() - stage[0].getHeight(null))/2);
        //System.out.println("width"+EnemyMove.getSizeLength());
        //System.out.println("Hight"+EnemyMove.getSizeHeight());
        g.drawImage(stage[enemy], (int) ((720 - num2*5.6)/2),num, (int) (num2*5.6),num2,this );//(GameLauncher.getMainFrame().getHeight() - stage[0].getHeight(null))/2
        //g.drawImage(stage[0], EnemyMove.getXmove(), EnemyMove.getYmove(), EnemyMove.getSizeLength(), EnemyMove.getSizeHeight(), this );
        //g.drawImage(k, GameKeyListener.getPoint().x, GameKeyListener.getPoint().y, this); //k
        g.drawString(GameLogic.getNumberForChoose()[0], (int) ((720 -200)/2),numscore);
        g.drawString(GameLogic.getNumberForChoose()[1], (int) ((720 + 60)/2),numscore);

        g.drawImage(k, GameKeyListener.getPoint().x, GameKeyListener.getPoint().y,40+(40*GameLogic.getScore()/1000), 40+(40*GameLogic.getScore()/1000), this); //k

        g.drawImage(l,0,-4,this);
        g.drawImage(r,GameLauncher.getMainFrame().getWidth()-r.getWidth(null),-4,this);
        g.setFont(new Font("Emulogic", 1, 14));
        g.drawString("SCORE : " + GameLogic.getScore(), 20, 30);
    }
}