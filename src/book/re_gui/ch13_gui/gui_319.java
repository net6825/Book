package book.re_gui.ch13_gui;

import javax.swing.*;

public class gui_319 extends JFrame {
    public gui_319() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        JPanel panel = new JPanel();
        JLabel label = new JLabel("안녕하세요");
        JButton btn = new JButton("버튼");
        panel.add(label);
        panel.add(btn);
        this.add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new gui_319();
    }
}