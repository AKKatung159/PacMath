import javax.swing.*;
import java.awt.*;

public class GameLauncher {
    public static void main(String[] args) {
        new GameLauncher();
    }
    public GameLauncher(){
        JFrame frame = new JFrame();

        JLabel bg =new JLabel(new ImageIcon(getClass().getResource("/Background/Background.gif")));
        JLabel arrow = new JLabel(new ImageIcon(getClass().getResource("/Background/arrow.gif")));

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder());//512,720,512,720
        panel.setLayout(new GridLayout(0,1));
        //panel.se;
        //panel.add(arrow);
        panel.add(bg);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("PackMath");
        frame.pack();
        frame.setVisible(true);
    }
}
