package book.ch23_스레드;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 스레드_611_PROGRAMMING1 extends JFrame implements Runnable, ActionListener {
    JLabel label;
    JButton b1, b2;
    int num = 0;
    Thread t;

    public 스레드_611_PROGRAMMING1() {
        label = new JLabel("0", JLabel.CENTER);
        b1 = new JButton("START");
        b2 = new JButton("STOP");

        add("Center", label);
        JPanel p = new JPanel();
        p.add(b1);
        p.add(b2);

        add("South", p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public static void main(String[] args) {
        new 스레드_611_PROGRAMMING1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            t = new Thread(this);
            t.start();
        }
        if (e.getSource() == b2) {
            t.interrupt();
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                label.setText(String.valueOf(num));
                Thread.sleep(1);
                num++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
