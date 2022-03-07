package book.re_gui.ch15_gp;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("안녕하세요?", 10, 10);
        g.drawLine(10, 20, 100, 20);
        g.drawRect(10, 30, 110, 100);
    }
}

public class Gp_355 extends JFrame {
    public Gp_355() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel p = new MyPanel();
        setVisible(true);
        add(p);
    }

    public static void main(String[] args) {
        new Gp_355();
    }
}
