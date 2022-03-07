package book.ch13_GUI;

import javax.swing.*;

class MyFrame5 extends JFrame {
    public MyFrame5() {
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jpanel = new JPanel();
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        t2.setEditable(false);

        jpanel.add(t1);
        jpanel.add(t2);

        add(jpanel);
        setVisible(true);
    }
}

public class GUI_322_Ex6 {
    public static void main(String[] args) {
        MyFrame5 m = new MyFrame5();
    }
}
