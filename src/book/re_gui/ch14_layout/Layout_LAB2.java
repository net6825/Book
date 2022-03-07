package book.re_gui.ch14_layout;

import javax.swing.*;
import java.awt.*;

public class Layout_LAB2 extends JFrame {
    JPanel p1;

    public Layout_LAB2() {
        setSize(300, 200);
        setTitle("My a");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 4));
        for (int i = 0; i < 10; i++) {
            p1.add(new JButton("Button" + i));
        }
        add(p1);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layout_LAB2();
    }
}