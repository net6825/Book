package book.ch13_GUI;

import javax.swing.*;
import java.awt.*;

class MyFrame6 extends JFrame {
    public MyFrame6() {
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        panel.setBackground(Color.BLACK);
        panelA.setBackground(Color.pink);
        panelB.setBackground(Color.CYAN);

        JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
        panelA.add(label);

        JButton btn1 = new JButton("콤보피자");
        JButton btn2 = new JButton("포테이토 피자");
        JButton btn3 = new JButton("불고기 피자");

        panelB.add(btn1);
        panelB.add(btn2);
        panelB.add(btn3);

        panel.add(panelA);
        panel.add(panelB);

        add(panel);
        setVisible(true);
    }
}

public class GUI_324_LAB {
    public static void main(String[] args) {
        MyFrame6 m = new MyFrame6();
    }
}
