import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameKeyListener implements KeyListener {
    private static int key;
    private JFrame f;
    private static Point PlayerPoint;
    private static Point Size=new Point( (int) (60*5.6),60);
    public GameKeyListener(JFrame f){
        this.f=f;
        PlayerPoint=new Point(330,380);
    }
    public void keyTyped(KeyEvent e){

    }
    public void keyPressed(KeyEvent e){
        key =e.getKeyCode();
        System.out.println(key);
        if(key==37){//&&getPoint().x>80
            getPoint().x-=15;
        }
        else if(key==39){//&&getPoint().x<580
            getPoint().x+=15;

        }
        else if(key==38){
            getPoint().y-=15;
        }
        else if(key==40){
            getPoint().y+=15;

        }
        else if(key==45){
            getSize().x-=10*5.6;
            getSize().y-=10;
        }
        else if(key==61){
            getSize().x+=10*5.6;
            getSize().y+=10;


        }
    }
    public void keyReleased(KeyEvent e){

    }
    public static Point getPoint(){
        return PlayerPoint;
    }
    public static Point getSize(){
        return Size;
    }
}
//left37 right39
//-45 +61