package book.re_gui.ch15_gp;

import javax.swing.*;
import java.awt.*;

class BPanel extends JPanel {

    Font f1, f2, f3, f4, f5;


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        f1 = new Font("Agency FB", Font.PLAIN, 20);
        f2 = new Font("Arial", Font.BOLD, 20);
        f3 = new Font("Bell MT", Font.ITALIC, 20);
        f4 = new Font("Candara", Font.ITALIC | Font.BOLD, 20);
        f5 = new Font("Comic Sans MS", Font.BOLD, 20);

        g.setFont(f1);
        g.drawString("Hello World", 10, 30);
        g.setFont(f2);
        g.drawString("Hello World", 10, 50);
        g.setFont(f3);
        g.drawString("Hello World", 10, 70);
        g.setFont(f4);
        g.drawString("Hello World", 10, 90);
        g.setFont(f5);
        g.drawString("Hello World", 10, 110);

    }
}

public class Gp_P2 extends JFrame {
    public Gp_P2() {
        setTitle("B");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BPanel b = new BPanel();
        this.add(b);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Gp_P2();
    }
}
