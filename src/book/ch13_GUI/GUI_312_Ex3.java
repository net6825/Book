package book.ch13_GUI;

import javax.swing.*;
import java.awt.*;

class MyFrame1 extends JFrame {
    public MyFrame1() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ex3");

        setLayout(new FlowLayout());
        JButton btn = new JButton("BUTTON");
        this.add(btn);
        setVisible(true);
    }
}

public class GUI_312_Ex3 {
    public static void main(String[] args) {
        MyFrame1 f = new MyFrame1();
    }
}
