package book.re_gui.ch13_gui;

import javax.swing.*;
import java.awt.*;

public class gui_312 extends JFrame {
    public gui_312() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        setLayout(new FlowLayout());
        JButton btn = new JButton("버튼");
        this.add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new gui_312();
    }
}
