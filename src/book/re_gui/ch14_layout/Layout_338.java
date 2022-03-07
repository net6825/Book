package book.re_gui.ch14_layout;

import javax.swing.*;
import java.awt.*;

public class Layout_338 extends JFrame {
    public Layout_338() {
        setTitle("BOX Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        makeButton(panel, "button1");
        makeButton(panel, "button2");
        makeButton(panel, "button3");
        makeButton(panel, "B4");
        makeButton(panel, "Long Button");
        add(panel);
        pack();
        setVisible(true);
    }

    private void makeButton(JPanel panel, String text) {
        JButton btn = new JButton(text);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(btn);
    }

    public static void main(String[] args) {
        new Layout_338();
    }
}
