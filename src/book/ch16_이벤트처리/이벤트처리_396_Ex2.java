package book.ch16_이벤트처리;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends JFrame {
    private JButton btn;
    private JLabel label;

    public MyFrame1() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제2 innerClass");
        JPanel panel = new JPanel();
        btn = new JButton("버튼을 누르시오");
        label = new JLabel("아직 버튼 안눌림");
        btn.addActionListener(new MyListener1());
        panel.add(btn);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }

    private class MyListener1 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == btn) {
                label.setText("버튼 눌림");
            }
        }
    }
}


public class 이벤트처리_396_Ex2 {

    public static void main(String[] args) {
        MyFrame1 m = new MyFrame1();
    }
}
