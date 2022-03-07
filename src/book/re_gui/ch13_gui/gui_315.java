package book.re_gui.ch13_gui;

import javax.swing.*;
import java.awt.*;

public class gui_315 extends JFrame {
    public gui_315() {
        //화면의 현재 크기 얻음
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();

        setSize(300, 200);
        setLocation(screenSize.width / 2, screenSize.height / 2);   //프레임의 위치 현재 화면 중앙
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        Image img = kit.getImage("icon.gif");
        setIconImage(img);

        setLayout(new FlowLayout());
        JButton btn = new JButton("버튼");
        this.add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new gui_315();
    }
}
