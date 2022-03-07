package school.java.gui_thread._09_24_g;

import javax.swing.*;
import java.awt.*;

class _09_24_frame extends JFrame {
    public _09_24_frame(){
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("이지석");

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage("C:\\.png");
        this.setIconImage(img);

        Dimension screenSize = kit.getScreenSize();

//        setLocation(screenSize.width / 2, screenSize.height / 2);
        setLocationRelativeTo(null);    //화면 정중앙에 띄움

        JButton btn = new JButton("확인");

        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);

        this.add(btn);

        setVisible(true);
    }
}

public class _09_24_gui {
    public static void main(String[] args) {
        _09_24_frame f = new _09_24_frame();
    }
}
