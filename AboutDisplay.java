import java.awt.*;
//หน้าจอ about แสดงชื่อผู้จัดทำ
public class AboutDisplay extends Canvas {
    public void paint(Graphics g) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();  //สร้าง toolkit ไว้ import รูป

        Image aboutDisplay = toolkit.getImage("Background/AboutDisplay.png");
        Image arrow = toolkit.getImage("Background/arrow.gif");

        g.drawImage(aboutDisplay, 0, 0, this);
        g.drawImage(arrow, 35, 418, this);
    }
}
