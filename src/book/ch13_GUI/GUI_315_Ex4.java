package book.ch13_GUI;

import javax.swing.*;
import java.awt.*;

class MyFrame2 extends JFrame {
    public MyFrame2() {
        Toolkit kit = Toolkit.getDefaultToolkit();      //현재 화면의 크기를 얻음
        Dimension screenSize = kit.getScreenSize();     //현재 화면의 크기를 얻음
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image img = kit.getImage("캡처.PNG");
        setIconImage(img);
        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        this.add(button);
        setVisible(true);
    }
}

public class GUI_315_Ex4 {
    public static void main(String[] args) {
        MyFrame2 f = new MyFrame2();
    }
}
