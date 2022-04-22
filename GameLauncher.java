import javax.swing.*;
import java.awt.*;

public class GameLauncher {
    private static final int WIDTH = 720;
    private static final int HEIGHT = 512;
    private static final int ORIGIN_X = 360;
    private static final int ORIGIN_Y = 256;
    private static Sound sound;
    private static JFrame mainFrame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameLauncher gameLauncher = new GameLauncher();
            }
        });
    }
    public GameLauncher() {
        mainFrame = new JFrame();
        sound = new Sound();

        sound.setFile(2);
        //sound.play();
        //sound.loop();

        mainFrame.add(new MainDisplay());
        mainFrame.setTitle("PAC MATH");
        mainFrame.setBackground(Color.BLACK);
        mainFrame.setLocation(ORIGIN_X, ORIGIN_Y);
        mainFrame.setAlwaysOnTop(true);
        mainFrame.addKeyListener(new MainKeyListener());
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public static JFrame getMainFrame(){
        return mainFrame;
    }
}
