import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameLoseKeyListener implements KeyListener {
    private int key;
    private static int j = 0;
    private JFrame f=GameLauncher.getMainFrame();
    private static Point[] arrowPoint=new Point[2];
    public GameLoseKeyListener(){
        arrowPoint[0]=new Point(250,305);
        arrowPoint[1]=new Point(250,385);
    }
    public void keyTyped(KeyEvent e) {

    }
    public void keyPressed(KeyEvent e) {
        key = e.getKeyCode();
        System.out.println(key);
        if (key == 40) {//left
            j += 1;
            Sound s = new Sound();
            s.setFile(0);
            s.play();
        } else if (key == 38) {//right
            j -= 1;
            Sound s = new Sound();
            s.setFile(0);
            s.play();
        } else if (key == 10) { //enter
            Sound s = new Sound();
            s.setFile(0);
            s.play();
            if (j % 2 == 0) {
                f.getContentPane().removeAll();
                f.add(new GameDisplay());
                f.validate();
                f.removeKeyListener(f.getKeyListeners()[0]);
                f.addKeyListener(new GameKeyListener(f));
            } else if (j % 2 == 1) {
                f.getContentPane().removeAll();
                f.add(new MainDisplay());
                f.validate();
                f.removeKeyListener(f.getKeyListeners()[0]);
                f.addKeyListener(new MainKeyListener());
            }
        }
    }
    public void keyReleased(KeyEvent e) {
    }
    public static Point getPoint(){
        return arrowPoint[j%2];
    }
}