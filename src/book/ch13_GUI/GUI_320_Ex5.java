package book.ch13_GUI;

import javax.swing.*;

class MyFrame4 extends JFrame {
    public MyFrame4() {
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        JButton b = new JButton();
        b.setText("왼쪽 버튼");
        JButton b1 = new JButton("중앙 버튼");
        JButton b2 = new JButton("오르쪽 버튼");
        b2.setEnabled(false);       //버튼 동작 못하게 막는 메소드

        p.add(b);
        p.add(b1);
        p.add(b2);

        add(p);
        setVisible(true);
    }
}

public class GUI_320_Ex5 {
    public static void main(String[] args) {
        MyFrame4 m = new MyFrame4();
    }
}
