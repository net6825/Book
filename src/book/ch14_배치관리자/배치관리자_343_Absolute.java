package book.ch14_배치관리자;

import javax.swing.*;

class MyFrame3 extends JFrame {
    JButton b1;
    private JButton b2, b3;

    public MyFrame3() {
        setTitle("Absolute Position Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        JPanel p = new JPanel();
        p.setLayout(null);

        b1 = new JButton("Button #1");
        p.add(b1);
        b2 = new JButton("Button #1");
        p.add(b2);
        b3 = new JButton("Button #1");
        p.add(b3);

        b1.setBounds(20, 5, 95, 30);
        b2.setBounds(55, 45, 105, 70);
        b3.setBounds(180, 15, 105, 90);
        add(p);
        setVisible(true);
    }
}

public class 배치관리자_343_Absolute {
    public static void main(String[] args) {
        MyFrame3 f = new MyFrame3();
    }
}
