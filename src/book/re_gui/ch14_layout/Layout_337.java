package book.re_gui.ch14_layout;

import javax.swing.*;
import java.awt.*;

public class Layout_337 extends JFrame {
    public Layout_337() {
        setTitle("GridLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(0, 3));

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("B4"));
        add(new JButton("Long Button"));

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layout_337();
    }
}
