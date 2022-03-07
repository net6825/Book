package book.re_gui.ch16_el;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame2 extends JFrame {
    private JButton button1;
    private JButton button2;
    private JPanel panel;
    MyListener2 listener = new MyListener2();

    public MyFrame2() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트");
        panel = new JPanel();
        button1 = new JButton("노란색");
        button1.addActionListener(listener);
        panel.add(button1);
        button2 = new JButton("핑크색");
        button2.addActionListener(listener);
        panel.add(button2);
        this.add(panel);
        this.setVisible(true);
    }

    private class MyListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                panel.setBackground(Color.YELLOW);
            } else if (e.getSource() == button2) {
                panel.setBackground(Color.PINK);
            }
        }
    }

}

public class El_402 {
    public static void main(String[] args) {
        new MyFrame2();
    }
}
