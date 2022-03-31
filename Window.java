import javax.swing.JFrame;
public class Window extends JFrame{
    public Window(){
        setTitle("Games");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new GamePanel(1440,1024));

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
