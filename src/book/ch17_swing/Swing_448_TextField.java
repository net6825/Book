package book.ch17_swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends JFrame {
    private JButton button;
    private JTextField text, result;

    public MyFrame1() {
        setSize(300, 130);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonListener listener = new ButtonListener();

        JPanel panel = new JPanel();
        panel.add(new JLabel("숫자 입력: "));
        text = new JTextField(15);
        text.addActionListener(listener);
        panel.add(text);

        panel.add(new JLabel("제곱한 값: "));
        result = new JTextField(15);
        result.setEditable(false);
        panel.add(result);

        button = new JButton("OK");
        button.addActionListener(listener);
        panel.add(button);

        add(panel);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button || e.getSource() == text) {
                String name = text.getText();
                long value = Integer.parseInt(name);
                result.setText(" " + value * value);
                text.requestFocus();
            }
        }
    }
}

public class Swing_448_TextField {
    public static void main(String[] args) {
        new MyFrame1();
    }
}
