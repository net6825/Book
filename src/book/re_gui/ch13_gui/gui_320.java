package book.re_gui.ch13_gui;

import javax.swing.*;

public class gui_320 extends JFrame {
    public gui_320() {
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("테스트 프레임");

        JPanel panel = new JPanel();
        JButton btn1 = new JButton("1번");
        JButton btn2 = new JButton("2번");
        JButton btn3 = new JButton("3번");

        btn3.setEnabled(false);

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);

        this.add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new gui_320();
    }
}
