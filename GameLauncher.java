import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GameLauncher {
    private static JFrame f;
    public static JFrame getF(){
        return f;
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameLauncher gameLauncher=new GameLauncher();
            }
        });
    }
    public GameLauncher(){
        f=new JFrame();
        //Canvas m=new MainDisplay();
        Sound s=new Sound();

        s.setFile(1);
        s.play();
        s.loop();

        f.add(new MainDisplay());
        //f.getContentPane().removeAll();
        //f.add(new AboutDisplay());
        f.addKeyListener(new MyKeyListener(f));
        f.setSize(1200,853);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
