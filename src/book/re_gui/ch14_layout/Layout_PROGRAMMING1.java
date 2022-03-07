package book.re_gui.ch14_layout;

import javax.swing.*;
import java.awt.*;

public class Layout_PROGRAMMING1 extends JFrame {
    public Layout_PROGRAMMING1() {
        setSize(250, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("마일을 킬로미터로 변환");

        JPanel p1 = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new BorderLayout());
        JPanel p3 = new JPanel(new GridLayout());
        JPanel p4 = new JPanel();


        JLabel label = new JLabel("거리를 마일 단위로 입력하시오");

        JButton button = new JButton("변환");
        button.setLayout(new FlowLayout(FlowLayout.CENTER));

        JTextField textField1 = new JTextField(5);
        JTextField textField2 = new JTextField(10);

        p1.add(label);
        p1.add(textField1);
        p2.add(button);
        p3.add(textField2);

        p4.add(p1);
        p4.add(p2);
        p4.add(p3);

        this.add(p4);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Layout_PROGRAMMING1();
    }
}
