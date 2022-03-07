package book.ch13_GUI;

import javax.swing.*;

class MyFrame extends JFrame {
    public MyFrame() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Frame");
        setVisible(true);
    }
}

public class GUI_310_Ex2 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
