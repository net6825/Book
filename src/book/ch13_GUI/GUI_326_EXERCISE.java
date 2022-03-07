package book.ch13_GUI;

import javax.swing.*;

class frame extends JFrame {
    frame() {
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jpanel = new JPanel();
        JLabel jlabel = new JLabel("자바는 재미있나요?");
        JButton button1 = new JButton("YES");
        JButton button2 = new JButton("NO");

        jpanel.add(jlabel);
        jpanel.add(button1);
        jpanel.add(button2);
        add(jpanel);
        setVisible(true);
    }
}

public class GUI_326_EXERCISE {
    public static void main(String[] args) {
        frame f = new frame();
    }
}
