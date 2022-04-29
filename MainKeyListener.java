import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainKeyListener implements KeyListener {
    private static Point[] p = new Point[3];
    private static int key;
    private static int j = 0;
    private JFrame f=GameLauncher.getMainFrame();
    public MainKeyListener() {
        this.f = f;
        p[0] = new Point(260, 280);
        p[1] = new Point(260, 350);
        p[2] = new Point(260, 420);
    }
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        key = e.getKeyCode();
        //System.out.println(key);
        if (key == 40||key==83) { //down arrow
            j += 1;
            Sound s = new Sound();
            s.setFile(0);
            s.play();
        }
        if (key == 38||key==87) { //up arrow
            j -= 1;
            if (j < 0) {
                j = 3;
            }
            Sound s = new Sound();
            s.setFile(0);
            s.play();
        }
        if (key == 10||key==32) { //enter
            Sound s = new Sound();
            s.setFile(0);
            s.play();
            if (j%3 == 0) {
                f.getContentPane().removeAll();// ลบobj เก่าออกให้หมด
                f.add(new GameDisplay());//
                f.validate();// รีเฟรชจอ
                f.removeKeyListener(f.getKeyListeners()[0]);
                f.addKeyListener(new GameKeyListener());
            }
            else if (j%3 == 1) {
                f.getContentPane().removeAll();
                f.add(new AboutDisplay());
                f.validate();
                f.removeKeyListener(f.getKeyListeners()[0]);
                f.addKeyListener(new AboutKeyListener());
            }
            else if (j%3 == 2) {
                f.dispose();
            }
        }
        //---------------------------
        /*
        if(key==87){//win
            f.getContentPane().removeAll();
            f.add(new GameWinDisplay());
            f.validate();
            f.removeKeyListener(f.getKeyListeners()[0]);
            f.addKeyListener(new GameWinKeyListener());
        }
        if(key==76){//lose
            f.getContentPane().removeAll();
            f.add(new GameLoseDisplay());
            f.validate();
            f.removeKeyListener(f.getKeyListeners()[0]);
            f.addKeyListener(new GameLoseKeyListener());
        }
        */
        //---------------------------
    }
    public void keyReleased(KeyEvent e) {}
    public static Point getPoint() {
        return p[j%3];
    }
}
//down 40 up 38 enter 10
//w 87 a 65 s 83 d 68 space 32