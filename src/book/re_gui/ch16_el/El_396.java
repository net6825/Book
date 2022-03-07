package book.re_gui.ch16_el;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends JFrame {
    private JButton button;
    private JLabel label;

    public MyFrame1() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");
        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르시오");
        label = new JLabel("아직 버튼이 눌려지지 않았습니다");
        button.addActionListener(new MyListener1());
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }

    class MyListener1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                label.setText("버튼 눌림");
            }
        }
    }
}

public class El_396 {
    public static void main(String[] args) {
        new MyFrame1();
    }
}
