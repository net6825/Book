package book.ch23_스레드;

import javax.swing.*;
import java.awt.*;

public class 스레드_611_PROGRAMMING3 extends JFrame implements Runnable {
    JFrame frame = new JFrame();
    int x, y;

    public 스레드_611_PROGRAMMING3() {
        this.x = 0;
        this.y = 150;
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 300);
        g.setColor(Color.BLACK);
        g.drawString("흘러가는 문자열", x, y);
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 41; i++) {
                repaint();
                try {
                    Thread.sleep(120);
                    x += 10;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        스레드_611_PROGRAMMING3 t = new 스레드_611_PROGRAMMING3();
        Thread thread = new Thread(t);
        thread.start();
    }
}