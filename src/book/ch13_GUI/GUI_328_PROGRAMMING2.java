package book.ch13_GUI;

import javax.swing.*;

class PFrame extends JFrame {
    public PFrame() {
        setTitle("테스트 프레임");
        setSize(700, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel a = new JPanel();
        JLabel a1 = new JLabel("인간에게 주어진 최상의 선물은 마음껏 웃을 수 있다는 것이다");
        JLabel b1 = new JLabel("가능한 목표라고 하더라도 그것을 꿈꾸고 상상하는 순간 이미 거기에 다가가 있는 것이다");
        JLabel c1 = new JLabel("가능한 목표라고 하더라도 그것을 꿈꾸고 상상하는 순간 이미 거기에 다가가 있는 것이다");

        a.add(a1);
        a.add(b1);
        a.add(c1);
        add(a);
        setVisible(true);
    }
}

public class GUI_328_PROGRAMMING2 {
    public static void main(String[] args) {
        PFrame f = new PFrame();
    }
}
