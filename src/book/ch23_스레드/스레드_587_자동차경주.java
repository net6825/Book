package book.ch23_스레드;

import javax.swing.*;

public class 스레드_587_자동차경주 extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    int x1 = 100, x2 = 100, x3 = 100;

    class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 120; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                x1 += (int) (Math.random() * 10);
                label1.setBounds(x1, 0, 100, 100);
                x2 += (int) (Math.random() * 10);
                label1.setBounds(x2, 0, 100, 100);
                x3 += (int) (Math.random() * 10);
                label1.setBounds(x3, 0, 100, 100);
            }
        }
    }

    public 스레드_587_자동차경주() {
        setTitle("자동차 경주");
        setSize(600, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        label1 = new JLabel();
        label1.setIcon(new ImageIcon("ch23_스레드/spaceship.png"));
        label2 = new JLabel();
        label2.setIcon(new ImageIcon("ch23_스레드/spaceship.png"));
        label3 = new JLabel();
        label3.setIcon(new ImageIcon("ch23_스레드/spaceship.png"));
        add(label1);
        add(label2);
        add(label3);
        label1.setBounds(100, 0, 100, 100);
        label2.setBounds(100, 50, 100, 100);
        label3.setBounds(100, 100, 100, 100);
        new MyThread().start();
        setVisible(true);
    }

    public static void main(String[] args) {
        스레드_587_자동차경주 t = new 스레드_587_자동차경주();
    }
}
