import javax.swing.*;
import java.awt.*;

public class GameLauncher {
    private static JFrame mainFrame;
    public static JFrame getMainFrame(){
        return mainFrame;
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameLauncher gameLauncher = new GameLauncher();
            }
        });
    }
    public GameLauncher() {
        mainFrame = new JFrame();
        Sound sound = new Sound();

        sound.setFile(2);//1
        sound.play();
        sound.loop();

        mainFrame.add(new MainDisplay());
        mainFrame.setTitle("PAC MATH");
        mainFrame.setBackground(Color.BLACK);
        mainFrame.setLocation(360, 256);
        mainFrame.setAlwaysOnTop(true);
        mainFrame.addKeyListener(new MainKeyListener());
        mainFrame.setSize(720, 512);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
