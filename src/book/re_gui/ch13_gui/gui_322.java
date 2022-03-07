package book.re_gui.ch13_gui;

import javax.swing.*;

public class gui_322 extends JFrame {
    public gui_322() {
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("테스트 프레임");

        JPanel panel = new JPanel();
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        t2.setEditable(false);

        panel.add(t1);
        panel.add(t2);

        this.add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new gui_322();
    }
}
