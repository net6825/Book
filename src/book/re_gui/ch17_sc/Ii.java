package book.re_gui.ch17_sc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ii extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel label;
    private JButton button;

    public Ii() {
        setTitle("이미지 레이블");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        label = new JLabel("이미지를 보려면 아래 버튼을 누르세요");

        button = new JButton("이미지 레이블");
        ImageIcon icon = new ImageIcon("C:\\Users\\net68\\IdeaProjects\\Book\\src\\book.re_gui\\ch17_sc\\img\\game1.png");
        button.setIcon(icon);
        button.addActionListener(this);
        panel.add(label);
        panel.add(button);
        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ImageIcon dog = new ImageIcon("C:\\Users\\net68\\IdeaProjects\\Book\\src\\book.re_gui\\ch17_sc\\img\\game2.png");
        label.setIcon(dog);
        label.setText(null);
    }

    public static void main(String[] args) {
        new Ii();
    }
}
