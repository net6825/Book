package book.re_gui.ch14_layout;

import javax.swing.*;
import java.awt.*;

public class Layout_335 extends JFrame {
    public Layout_335() {
        setTitle("BorerLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        add(new JButton("CENTER"), BorderLayout.CENTER);
        add(new JButton("LINE START"), BorderLayout.LINE_START);
        add(new JButton("LINE END"), BorderLayout.LINE_END);
        add(new JButton("PAGE START"), BorderLayout.PAGE_START);
        add(new JButton("PAGE END"), BorderLayout.PAGE_END);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layout_335();
    }
}
