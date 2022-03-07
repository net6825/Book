package school.java.gui_thread._09_28_g;

import javax.swing.*;
import java.awt.*;

class AC extends JPanel{
    int[] x = new int[]{};
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //그래픽 텍스트 출력
        g.setColor(Color.white);
        g.fillOval(100, 100, 250, 250);
        g.setColor(Color.YELLOW);
        g.fillOval(125, 125, 200, 200);
        g.setColor(Color.RED);
        g.fillOval(200, 220, 50, 50);
        g.setColor(Color.RED);
        g.drawArc(225,195,50,75,210,80);
        g.drawArc(180,195,50,75,10,-90);
    }
}

class AB extends JFrame {
    public AB(){
        setTitle("그래픽");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //그림을 그림 paintComponent메소드 가질 나의 Panel 객체 생성
        AC panel = new AC();
        add(panel);
        setVisible(true);
    }
}

public class A {
    public static void main(String[] args) {
        AB f = new AB();
    }
}
