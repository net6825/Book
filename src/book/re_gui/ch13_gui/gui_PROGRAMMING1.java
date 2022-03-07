package book.re_gui.ch13_gui;

import javax.swing.*;
import java.awt.*;

public class gui_PROGRAMMING1 extends JFrame {
    public gui_PROGRAMMING1() {
        setSize(600, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel(new FlowLayout());

        JLabel label = new JLabel("자바는 재미있나요?");

        JButton btn1 = new JButton("Yes");
        JButton btn2 = new JButton("No");

        p.add(label);
        p.add(btn1);
        p.add(btn2);

        this.add(p);

        setVisible(true);
    }

    public static void main(String[] args) {
        new gui_PROGRAMMING1();
    }
}
