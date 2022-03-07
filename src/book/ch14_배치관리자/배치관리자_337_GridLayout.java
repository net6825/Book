package book.ch14_배치관리자;

import javax.swing.*;
import java.awt.*;

class MyFrame0 extends JFrame {
    public MyFrame0() {
        setTitle("GridLayout Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(0, 3));

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("B4"));
        add(new JButton("LONG BUTTON5"));

        pack();
        setVisible(true);
    }
}

public class 배치관리자_337_GridLayout {
    public static void main(String[] args) {
        MyFrame0 f = new MyFrame0();
    }
}
