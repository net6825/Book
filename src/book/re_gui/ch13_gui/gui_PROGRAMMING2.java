package book.re_gui.ch13_gui;

import javax.swing.*;

public class gui_PROGRAMMING2 extends JFrame {
    public gui_PROGRAMMING2() {
        setSize(600, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
//        JPanel p2 = new JPanel();
//        JPanel p3 = new JPanel();

        JLabel l1 = new JLabel("인간에게 주어진 최상의 선물은 마음껏 웃을 수 있다는 것이다.");
        JLabel l2 = new JLabel("가능한 목표라고 하더라도 그것을 꿈꾸고 상상하는 순간 이미 거기에 다가가 있는 것이다.");
        JLabel l3 = new JLabel("상상력은 생존의 힘이다.");

        p1.add(l1);
        p1.add(l2);
        p1.add(l3);

        this.add(p1);
//        this.add(p2);
//        this.add(p3);

        setVisible(true);
    }

    public static void main(String[] args) {
        new gui_PROGRAMMING2();
    }
}
