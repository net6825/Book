package book.re_gui.ch13_gui;

import javax.swing.*;
import java.awt.*;

public class gui_EXERCISE4 extends JFrame {
    gui_EXERCISE4() {
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("테스트 프레임");

        JPanel p = new JPanel(new FlowLayout());

        JLabel l = new JLabel("자바는 재미있나요?");

        JButton y = new JButton("Yes");
        JButton n = new JButton("No");

        p.add(l);
        p.add(y);
        p.add(n);
        this.add(p);

        setVisible(true);
    }

    public static void main(String[] args) {
        new gui_EXERCISE4();
    }
}
