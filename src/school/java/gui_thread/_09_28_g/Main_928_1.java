package school.java.gui_thread._09_28_g;

import javax.swing.*;
import java.awt.*;

class MyPanel_928_1 extends JPanel {
    int[] xPoints= new int[]{0, 50, 0, 50};
    int[] yPoints = new int[]{70, 120, 120, 70};
    int[] xPolyA = new int[]{490, 540, 490, 540};
    int[] yPolyA = new int[]{2, 52, 52, 2};
    int[] yPolyB = new int[]{70,120,120,70};

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //그래픽 텍스트 출력
        g.drawLine(0,50, 50,0);
        g.drawString("drawLine()",0,60);
        g.drawPolyline(xPoints,yPoints,4);
        g.drawString("drawPolyline()", 0, 130);
        g.drawRect(90, 2, 50, 50);
        g.drawString("drawRect()", 90, 60);
        g.fillRect(90, 70, 50, 50);
        g.drawString("fillRect()", 90, 130);
        g.draw3DRect(170, 2, 50, 50, true);
        g.drawString("draw3DRect()", 170, 60);
        g.fill3DRect(170,70,50,50,true);
        g.drawString("fill3DRect()", 170, 130);
        g.drawRoundRect(250, 2, 50, 50, 10, 10);
        g.drawString("drawRoundRect()", 250, 60);
        g.fillRoundRect(250,70,50,50,10,10);
        g.drawString("fillRoundRect()", 250, 130);
        g.drawOval(350, 2, 50, 50);
        g.drawString("drawOval()", 350, 60);
        g.fillOval(350, 70, 50, 50);
        g.drawString("fillOval()", 350, 130);
        g.drawArc(420,2,50,50, 100,130);
        g.drawString("drawArc()", 420, 60);
        g.fillArc(420, 70, 50, 50, 100, 130);
        g.drawPolygon(xPolyA, yPolyA,4);
        g.drawString("drawPolygon()", 490, 60);
        g.fillPolygon(xPolyA,yPolyB,4);
    }
}

class MyFrame_928_1 extends JFrame {
    public MyFrame_928_1(){
        setTitle("그래픽");
        setSize(1000, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //그림을 그림 paintComponent메소드 가질 나의 Panel 객체 생성
        MyPanel_928_1 panel = new MyPanel_928_1();
        add(panel);
        setVisible(true);
    }
}

public class Main_928_1 {
    public static void main(String[] args) {
        MyFrame_928_1 f = new MyFrame_928_1();
    }
}
