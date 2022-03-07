package book.ch17_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    private JRadioButton small, medium, large;
    private JLabel text;
    private JPanel topPanel, sizePanel, resultPanel;

    public MyFrame() {
        setTitle("라디오 버튼 테스트");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        topPanel = new JPanel();
        JLabel label = new JLabel("어떤 크기의 커피");
        topPanel.add(label);
        add(topPanel, BorderLayout.NORTH);

        sizePanel = new JPanel();
        small = new JRadioButton("Small Size");
        medium = new JRadioButton("Medium Size");
        large = new JRadioButton("Large Size");

        ButtonGroup size = new ButtonGroup();
        size.add(small);
        size.add(medium);
        size.add(large);

        small.addActionListener(this);
        medium.addActionListener(this);
        large.addActionListener(this);
        sizePanel.add(small);
        sizePanel.add(medium);
        sizePanel.add(large);
        add(sizePanel, BorderLayout.CENTER);

        resultPanel = new JPanel();
        text = new JLabel("크기 선택 X");
        text.setForeground(Color.red);
        resultPanel.add(text);
        add(resultPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == small) {
            text.setText("작은크기");
        }
        if (e.getSource() == medium) {
            text.setText("중간");
        }
        if (e.getSource() == large) {
            text.setText("큼");
        }
    }
}

public class Swing_441_Coffe {
    public static void main(String[] args) {
        new MyFrame();
    }
}
