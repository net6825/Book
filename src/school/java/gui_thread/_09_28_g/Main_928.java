package school.java.gui_thread._09_28_g;

import javax.swing.*;
import java.awt.*;

class MyPanel_928 extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //그래픽 텍스트 출력
        g.setColor(Color.BLUE);
        g.drawString("안녕하세요",10,10);
        g.setColor(Color.RED);
        g.drawLine(10, 20, 110, 20);
        g.drawRect(10,30,100,100);
    }
}

class MyFrame_928 extends JFrame {
    public MyFrame_928(){
        setTitle("그래픽");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //그림을 그림 paintComponent메소드 가질 나의 Panel 객체 생성
        MyPanel_928 panel = new MyPanel_928();
        add(panel);
        setVisible(true);
    }
}

public class Main_928 {
    public static void main(String[] args) {
        MyFrame_928 f = new MyFrame_928();
    }
}
