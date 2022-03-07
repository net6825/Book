package book.ch16_이벤트처리;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyFrame3 extends JFrame implements KeyListener {
    public MyFrame3() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField tf = new JTextField(20);
        tf.addKeyListener(this);

        add(tf);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        display(e, "KeyTyped");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        display(e, "Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        display(e, "Key Released");
    }

    protected void display(KeyEvent e, String s) {
        char c = e.getKeyChar();
        int keyCode = e.getKeyCode();
        String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
        System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
    }
}

public class 이벤트처리_405_Key1 {
    public static void main(String[] args) {
        MyFrame3 n = new MyFrame3();
    }
}
