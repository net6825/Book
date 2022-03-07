package book.re_gui.ch16_el;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class P5 extends JFrame {
    public P5() {
        setSize(600, 130);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Frame");

        JLabel label;
        label = new JLabel("Don't cry before you are hurt.");
        label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 50));
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                label.setText("다치기도 전에 울지 말라");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                label.setText("Don't cry before you are hurt.");
            }
        });
        add(label);

        setVisible(true);
    }
}

public class El_p5 {
    public static void main(String[] args) {
        new P5();
    }
}
