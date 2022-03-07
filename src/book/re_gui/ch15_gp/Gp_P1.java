package book.re_gui.ch15_gp;

import javax.swing.*;
import java.awt.*;

class APanel extends JPanel {
    int a = (int) (Math.random() * 255);
    int b = (int) (Math.random() * 255);
    int c = (int) (Math.random() * 255);

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.getHSBColor(a, b, c));
        g.drawString("Hello World", 100, 100);
    }
}

public class Gp_P1 extends JFrame {
    public Gp_P1() {
        setTitle("a");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        APanel a = new APanel();
        this.add(a);
        System.out.println("A");
        setVisible(true);
    }

    public static void main(String[] args) {
        Gp_P1 a = new Gp_P1();
    }
}
