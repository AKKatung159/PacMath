import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameKeyListener implements KeyListener {
    private static int key;
    private JFrame f;
    private static Point PlayerPoint;
    public GameKeyListener(JFrame f){
        this.f=f;
        PlayerPoint=new Point(330,380);
    }
    public void keyTyped(KeyEvent e){

    }
    public void keyPressed(KeyEvent e){
        key =e.getKeyCode();
        //System.out.println(key);
        if(key==37&&getPoint().x>80){
            getPoint().x-=10;
        }
        else if(key==39&&getPoint().x<580){
            getPoint().x+=10;

        }
    }
    public void keyReleased(KeyEvent e){

    }
    public static Point getPoint(){
        return PlayerPoint;
    }
}
//left37 right39
