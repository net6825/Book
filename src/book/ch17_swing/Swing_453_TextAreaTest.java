package book.ch17_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame2 extends JFrame implements ActionListener {
    protected JTextField textField;
    protected JTextArea textArea;

    public MyFrame2() {
        setTitle("Text Area Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(30);
        textField.addActionListener(this);

        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);

        add(textField, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        textArea.append(text + "\n");
        textField.selectAll();
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}

public class Swing_453_TextAreaTest {
    public static void main(String[] args) {
        new MyFrame2();
    }
}
