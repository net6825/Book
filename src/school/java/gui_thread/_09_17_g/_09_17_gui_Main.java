package school.java.gui_thread._09_17_g;

import javax.swing.*;
import java.awt.*;

class _09_17_gui_MyFrame extends JFrame {
    public _09_17_gui_MyFrame(){
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("이지석");
        setLayout(new FlowLayout());

        JButton btn = new JButton("웹디비");
        this.add(btn);
        JButton btn2 = new JButton("웹디비2");
        this.add(btn2);

        setVisible(true);
    }
}

public class _09_17_gui_Main {
    public static void main(String[] args) {
        _09_17_gui_MyFrame f = new _09_17_gui_MyFrame();
    }
}