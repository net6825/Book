package book.re_gui.ch15_gp;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Circle extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Circle2 a = new Circle2(Color.YELLOW, 50, 50);
        Circle2 b = new Circle2(Color.BLACK, 100, 30);
        Circle2 c = new Circle2(Color.BLUE, 20, 100);
        Circle2 d = new Circle2(Color.CYAN, 70, 220);
        Circle2 e = new Circle2(Color.MAGENTA, 20, 150);
        Circle2[] jisuck = {a, b, c, d, e};

        for (int i = 0; i < jisuck.length; i++) {
            g.setColor(jisuck[i].color);
            g.fillOval((int) Math.random() * 700, (int) Math.random() * 700, jisuck[i].radius * 2, jisuck[i].center);
        }

    }
}

class Circle2 {
    Color color;
    int radius;
    int center;

    public Circle2(Color color, int radius, int center) {
        this.color = color;
        this.radius = radius;
        this.center = center;
    }
}

public class Gp_P3 extends JFrame {
    public Gp_P3() {
        ArrayList<Circle> cs = new ArrayList<>();
        setTitle("a");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);


        Circle a = new Circle();

        this.add(a);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Gp_P3();
    }
}
