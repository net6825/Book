package book.re_gui.ch13_gui;

import javax.swing.*;

public class gui_LAB extends JFrame {
    public gui_LAB() {
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel P = new JPanel();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        JLabel L = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
        JButton b1 = new JButton("콤보피자");
        JButton b2 = new JButton("포테이토 피자");
        JButton b3 = new JButton("불고기 피자");

        P.add(p1);
        P.add(p2);
        p1.add(L);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        this.add(P);

        setVisible(true);
    }

    public static void main(String[] args) {
        new gui_LAB();
    }
}
