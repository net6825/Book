package book.ch14_배치관리자;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("FlowLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel.add(new JButton("Button1"));
        panel.add(new JButton("Button2"));
        panel.add(new JButton("Button3"));
        panel.add(new JButton("B4"));
        panel.add(new JButton("LONG BUTTON1"));
        add(panel);
        pack();
        setVisible(true);

    }
}

public class 배치관리자_333_FlowLayout {
    public static void main(String[] args) {
        MyFrame m = new MyFrame();
    }
}
