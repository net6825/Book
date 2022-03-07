package book.ch20_패키지;

import javax.swing.*;
import java.awt.*;

public class 패키지_498_LABCircleTest extends JFrame {
    패키지_498_LABCircle circle = new 패키지_498_LABCircle(100, 100, 30);

    public 패키지_498_LABCircleTest() {
        setTitle("Package");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel m = new MyPanel();
        setVisible(true);
        add(m);
    }

    class MyPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            circle.draw(g);
        }
    }

    public static void main(String[] args) {
        패키지_498_LABCircleTest a = new 패키지_498_LABCircleTest();
        Integer i = new Integer("100");
        System.out.println(i.getClass().getName());
    }
}
