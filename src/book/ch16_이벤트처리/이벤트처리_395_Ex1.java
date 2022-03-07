package book.ch16_이벤트처리;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        b.setText("버튼 눌림");
    }
}

class MyFrame extends JFrame {
    private JButton btn;

    public MyFrame() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");
        this.setLayout(new FlowLayout());
        btn = new JButton("버튼 누르시오");
        btn.addActionListener(new MyListener());
        this.add(btn);
        this.setVisible(true);
    }
}

public class 이벤트처리_395_Ex1 {
    public static void main(String[] args) {
        MyFrame n = new MyFrame();
    }
}

