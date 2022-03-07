package book.ch14_배치관리자;

import javax.swing.*;
import java.awt.*;

class MyFrame1 extends JFrame {
    public MyFrame1() {
        setTitle("BoxLayout Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        makeButton(panel, "Button");
        makeButton(panel, "Button2");
        makeButton(panel, "Button3");
        makeButton(panel, "B4");
        makeButton(panel, "LONG BUTTON5");
        add(panel);
        pack();
        setVisible(true);
    }

    private void makeButton(JPanel panel, String text) {
        JButton btn = new JButton(text);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(btn);
    }
}

public class 배치관리자_333_BoxLayout {
    public static void main(String[] args) {
        MyFrame1 f = new MyFrame1();
    }
}
