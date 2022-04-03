import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GameLauncher extends Canvas {
    public void paint(Graphics g) {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("Background/Background.gif");
        Image j=t.getImage("Background/arrow.gif");
        g.drawImage(i, 0,0,this);
        g.drawImage(j, MyKeyListener.getPoint().x,MyKeyListener.getPoint().y,this);
    }
    public static void main(String[] args) {
        GameLauncher m=new GameLauncher();
        JFrame f=new JFrame();
        f.add(m);
        f.addKeyListener(new MyKeyListener());
        f.remove(m);
        f.add(m);
        f.setSize(1200,853);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
