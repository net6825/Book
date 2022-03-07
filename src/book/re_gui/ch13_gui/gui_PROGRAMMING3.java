package book.re_gui.ch13_gui;

import javax.swing.*;

public class gui_PROGRAMMING3 extends JFrame {
    public gui_PROGRAMMING3() {
        setSize(600, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        JLabel l1 = new JLabel("자바 호텔에 오신 것을 환영합니다.");
        JLabel l2 = new JLabel("숙박일수를 입력하세요.");

        JButton btn1 = new JButton("1명");
        JButton btn2 = new JButton("2명");
        JButton btn3 = new JButton("3명");
        JButton btn4 = new JButton("4명");
        JButton btn5 = new JButton("5명");

        p3.add(btn1);
        p3.add(btn2);
        p3.add(btn3);
        p3.add(btn4);
        p3.add(btn5);

        p2.add(l1);
        p2.add(l2);

        p1.add(p2);
        p1.add(p3);

        this.add(p1);
        setVisible(true);
    }

    public static void main(String[] args) {
        new gui_PROGRAMMING3();
    }
}
