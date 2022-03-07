package book.re_gui.ch14_layout;

import javax.swing.*;

import java.awt.*;

public class Layout_EXERCISE4 extends JFrame {
    public Layout_EXERCISE4() {
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());

        JLabel[] labels = new JLabel[30];
        for (int i = 0; i < 30; i++) {
            labels[i] = new JLabel("" + i);
            int x = (int) (500 * Math.random());
            int y = (int) (200 * Math.random());
            labels[i].setForeground(Color.MAGENTA);
            labels[i].setBounds(x, y, 20, 20);
            p.add(labels[i]);
        }
        add(p);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layout_EXERCISE4();
    }
}
