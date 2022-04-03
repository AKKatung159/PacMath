import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {
    private  static Point[] p=new Point[3];
    private static int key;
    private static int j = 300;
    public MyKeyListener(){
        p[0]=new Point(430,465);
        p[1]=new Point(430,585);
        p[2]=new Point(430,695);
    }
    public void keyTyped(KeyEvent e){

    }
    public void keyPressed(KeyEvent e){
        key =e.getKeyCode();
        //System.out.println(key);
        if(key==40) {
            j+=1;
        }
        if(key==38) {
            j-=1;
        }
    }
    public void keyReleased(KeyEvent e){

    }
    public static Point getPoint(){
        Point k=p[0];
        k=p[j%3];
        return p[j%3];
    }
}

//down 40 up 38 enter 10