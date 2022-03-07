package book.re_gui.ch14_layout;

import javax.swing.*;
import java.awt.*;

public class Layout_LAB extends JFrame {
    JPanel p1;

    public Layout_LAB() {
        setSize(300, 200);
        setTitle("My Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        for (int i = 0; i < 10; i++) {
            p1.add(new JButton("Button" + i));
        }
        add(p1);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layout_LAB();
    }
}
