import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//รอรับคีย์ enter เพื่อกลับสู่ main menu
public class AboutKeyListener implements KeyListener {
    private static int key;
    private JFrame frame=GameLauncher.getMainFrame();

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        key = e.getKeyCode();//รับ key code
        if (key == 10) {//รับ key enter
            Sound s = new Sound();
            s.setFile(0);
            s.play(); //เล่นเสียง

            frame.getContentPane().removeAll();//ลบ canvas display เพื่อเปลี่ยนเป็น main
            frame.add(new MainDisplay());
            frame.validate();
            frame.removeKeyListener(frame.getKeyListeners()[0]);
            frame.addKeyListener(new MainKeyListener());
        }
    }

    public void keyReleased(KeyEvent e) {}
}

