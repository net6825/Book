package book.re_gui.ch14_layout;

import javax.swing.*;
import java.awt.*;

public class Layout_333 extends JFrame {
    public Layout_333() {
        setTitle("FLowLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel;

        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel.add(new JButton("button1"));
        panel.add(new JButton("button2"));
        panel.add(new JButton("button3"));
        panel.add(new JButton("B4"));
        panel.add(new JButton("LONG BUTTON5"));
        add(panel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layout_333();
    }
}
