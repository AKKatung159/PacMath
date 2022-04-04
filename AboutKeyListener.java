import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AboutKeyListener implements KeyListener {
    private static int key;
    private static int j = 0;
    private JFrame f;
    public AboutKeyListener(JFrame f){
        this.f=f;
    }
    public void keyTyped(KeyEvent e){

    }
    public void keyPressed(KeyEvent e){
        key =e.getKeyCode();
        if(key==10){
            Sound s=new Sound();
            s.setFile(0);
            s.play();
            f.getContentPane().removeAll();
            f.add(new MainDisplay());
            f.validate();
            f.removeKeyListener(f.getKeyListeners()[0]);
            f.addKeyListener(new MainKeyListener(f));
        }
    }
    public void keyReleased(KeyEvent e){

    }
}

