package book.ch23_스레드;

import javax.swing.*;
import java.awt.*;

public class 스레드_585_예제2 extends JFrame {
    private JLabel label;

    class MyThread extends Thread {
        public void run() {
            for (int i = 10; i >= 0; i--) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                label.setText(i + "");
            }
        }
    }

    public 스레드_585_예제2() {
        setTitle("카운트 다운");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("START");
        label.setFont(new Font("Serif", Font.BOLD, 100));
        add(label);
        new MyThread().start();
        setVisible(true);
    }

    public static void main(String[] args) {
        스레드_585_예제2 t = new 스레드_585_예제2();
    }
}
