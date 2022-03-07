package book.ch13_GUI;

import javax.swing.*;

class PFrame1 extends JFrame {
    PFrame1() {
        setSize(500, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("테스트 프레임");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JLabel l1 = new JLabel("자바 호텔에 오신 것을 환영합니다");
        JLabel l2 = new JLabel("숙박일수를 입력하세요");
        JButton b1 = new JButton("1명");
        JButton b2 = new JButton("2명");
        JButton b3 = new JButton("3명");
        JButton b4 = new JButton("4명");
        JButton b5 = new JButton("5명");

        p2.add(l1);
        p2.add(l2);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);
        p3.add(b5);
        p1.add(p2);
        p1.add(p3);
        add(p1);

        setVisible(true);
    }
}

public class GUI_328_PROGRAMMING3 {
    public static void main(String[] args) {
        PFrame1 f = new PFrame1();
    }
}
