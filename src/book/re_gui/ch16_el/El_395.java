package book.re_gui.ch16_el;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        button.setText("버튼이 눌려졌습니다");
    }
}

class MyFrame extends JFrame {
    private JButton button;

    public MyFrame() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트");
        this.setLayout(new FlowLayout());
        button = new JButton("버튼 입력");
        button.addActionListener(new MyListener());
        this.add(button);
        this.setVisible(true);
    }
}

public class El_395 {
    public static void main(String[] args) {
        new MyFrame();
    }
}
