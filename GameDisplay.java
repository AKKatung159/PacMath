import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameDisplay extends Canvas {
    private int num=0,num2=60,round=0,enemy=0,enemyrandom=0;
    private static int roundd;
    private double size=14,numscore=30,xEnemy=0;
    private boolean checkBomb=false;
    private JFrame frame=GameLauncher.getMainFrame();
    private Random random = new Random();
    private Image[] enemyrand = new Image[3];
    private Image[] stage = new Image[8];
    private static String keyMove="";
    public static String getKeyMove(){
        return keyMove;
    }
    public GameDisplay(){
        roundd=round;
        new GameLogic();
        GameLogic.setScore(0);
        enemy=EnemyMove.getEnemyPic();
        enemyrandom=EnemyMove.getEnemyRan();
    }

    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        //add image
        Image gameDisplay = t.getImage("Background/GameDisplay.png");
        Image player = t.getImage("Background/player.gif");
        Image frameLeft = t.getImage("Background/Frame 1.png");
        Image frameRight = t.getImage("Background/Frame 2.png");
        for (int j = 0; j < stage.length ; j++) {
            stage[j] = t.getImage("Asset/" + (j+1) + ".gif");
        }
        for (int j = 0; j < enemyrand.length ; j++) {
            enemyrand[j] = t.getImage("Background/enemy" + (j+1) + ".gif");
        }
        if((num+150)>350&&Math.abs(GameKeyListener.getPoint().x+20-(int) xEnemy)<30){
            GameLogic.hitEnemy();
            //System.out.println(Math.abs(GameKeyListener.getPoint().x-(int) ((enemyrandom)+((num-34)/2))));
            enemyrandom=2;
            checkBomb=true;
        }
        if(num>300&&round<=GameLogic.getLap()){
            round++;
            roundd=round;
            if(GameKeyListener.getPoint().x>340){
                GameLogic.checkScore("R");
            }
            else if (GameKeyListener.getPoint().x<=340){
                GameLogic.checkScore("L");
            }

            new GameLogic();


            System.out.println(round);
            num=0;
            num2=60;
            numscore=32;
            size=14;
            //enemy=random.nextInt(8);
            enemy=EnemyMove.getEnemyPic();
            enemyrandom=EnemyMove.getEnemyRan();
            checkBomb=false;
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
        numscore+=6.75;
        size+=0.30;

        //display game
        g.drawImage(gameDisplay, 0, 0, this);

        //enemy gate logic
        g.drawImage(stage[enemy], (int) ((720 - num2*5.6)/2),num, (int) (num2*5.6),num2,this );//(GameLauncher.getMainFrame().getHeight() - stage[0].getHeight(null))/2

        //enemy random logic
        if (enemyrandom>360){
            xEnemy=(int) ((enemyrandom)+((num-34)/2));
        }
        else{
            xEnemy=(int) ((enemyrandom)-((num-34)/2));
        }
        g.drawImage(enemyrand[enemy%2], (int) xEnemy,num+150,num2-40,num2-40,this );
        if(checkBomb){
            g.drawImage(enemyrand[2], (int) xEnemy,num+150,num2-30,num2-30,this );
        }
        //g.drawImage(bomb, (int)(enemy+1)*60,num+150,num2-30,num2-30,this );

        //number on gate
        g.setFont(new Font("Emulogic", 1, (int) size));
        g.setColor(Color.cyan);
        g.drawString(GameLogic.getNumberForChoose()[0], (int) ((720 -num2*2.3)/2), (int) numscore);
        g.drawString(GameLogic.getNumberForChoose()[1], (int) ((720 + 60)/2), (int) numscore);

        //player move
        g.drawImage(player, GameKeyListener.getPoint().x, GameKeyListener.getPoint().y-(40*GameLogic.getScore()/1000),40+(40*GameLogic.getScore()/1000), 40+(40*GameLogic.getScore()/1000), this); //k

        //draw frame
        g.drawImage(frameLeft,0,-4,this);
        g.drawImage(frameRight,GameLauncher.getMainFrame().getWidth()-frameRight.getWidth(null),-4,this);

        //draw score game
        g.setFont(new Font("Emulogic", 1, 14));
        g.drawString("SCORE : " + GameLogic.getScore(), 20, 30);
    }
    public static int getRound(){
        return roundd;
    }
}