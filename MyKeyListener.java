import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {
    private  static Point[] p=new Point[3];
    private static int key;
    private static int j = 300;
    private JFrame f;
    public MyKeyListener(JFrame f){
        this.f=f;
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
            Sound s=new Sound();
            s.setFile(0);
            s.play();
        }
        if(key==38) {
            j-=1;
            Sound s=new Sound();
            s.setFile(0);
            s.play();
        }
        if(key==10){
            Sound s=new Sound();
            s.setFile(0);
            s.play();
            if(j%3==0){
                System.out.println("play");
            }
            else if(j%3==1){
                f.getContentPane().removeAll();
                f.add(new AboutDisplay());
                f.validate();
                f.removeKeyListener(f.getKeyListeners()[0]);
            }
            else if(j%3==2){
                f.dispose();
            }
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