package school.java.gui_thread._10_12_g_t;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



class MyRect2 {
    int x, y;
    int width, height;
    Color color;

    MyRect2(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    void draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect(x, y, width, height);
    }

    public void setColor(Color c) {
        this.color = c;
    }
}

class MyPanel3 extends JPanel {


    static int MAXROW = 15;
    static int MAXCOL = 15;
    static MyRect2[][] rects; //paintComponent에서 접근하기 위해 멤버 변수로 설정
    static int headX = MAXCOL / 2;
    static int headY = MAXROW / 2;
    int score;

    MyPanel3() {
        //사각형 객체를 생성한다.
        rects = new MyRect2[MAXROW][MAXCOL];
        for (int i = 0; i < MAXROW; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                if (i == 0 || i == MAXROW - 1 || j == 0 || j == MAXCOL - 1) {
                    rects[i][j] = new MyRect2(60 * i + 50, 60 * j + 50, 55, 55, Color.BLACK);
                } else {
                    rects[i][j] = new MyRect2(60 * i + 50, 60 * j + 50, 55, 55, Color.BLUE);
                }
            }
        }
        rects[headY][headX].setColor(Color.white);

        MyListener2 listener = new MyListener2(this);
        this.addKeyListener(listener);
        setFocusable(true);
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < MAXROW; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                rects[i][j].draw(g);
            }
        }
        g.setColor(Color.RED);
        g.drawString(""+ score , 10, 10);
    }

}

class MyFrame3 extends JFrame {
    Toolkit kit = Toolkit.getDefaultToolkit();

    public MyFrame3() {
        class MyThread2 extends Thread{
            @Override
            public void run() {
                super.run();
                for (int i = 0; i < MyPanel3.MAXROW; i++) {
                    MyPanel3.rects[MyPanel3.headX][MyPanel3.headY+i].setColor(Color.WHITE);
                    try {
                        System.out.println(MyPanel3.headY);
                        Thread.sleep(1000);
                    } catch (Exception e) {}
                    MyPanel3.rects[MyPanel3.headX][MyPanel3.headY+i].setColor(Color.blue);
                    repaint();
                }
            }
        }
        setTitle("지렁이게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 2000);

        Dimension screenSize = kit.getScreenSize();
        setLocation((screenSize.width - getWidth())-2000, (screenSize.height - getHeight()) / 2);

        MyPanel3 myPanel = new MyPanel3();
        add(myPanel);

        MyThread2 t = new MyThread2();
        t.start();

        setVisible(true);

    }
}

class MyListener2 implements KeyListener {
    MyPanel3 mPanel;

    public MyListener2(MyPanel3 p) {
        mPanel = p;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.println(c);
        if(isWall(c) == false){
            mPanel.rects[mPanel.headY][mPanel.headX].setColor(Color.BLUE);

            switch (c){
                case 'a':
                    mPanel.headY = mPanel.headY-1;
                    break;
                case 'd':
                    mPanel.headY = mPanel.headY+1;
                    break;
                case 'w':
                    mPanel.headX = mPanel.headX-1;
                    break;
                case 's':
                    mPanel.headX = mPanel.headX+1;
                    break;
            }

        }
        mPanel.rects[mPanel.headY][mPanel.headX].setColor(Color.WHITE);

        //다시 강제로 그려주는 명령
        mPanel.repaint();
    }

    private boolean isWall(char c) {
        switch (c){
            case 'a':
                if(mPanel.headY==1){
                    return true;
                }
                    mPanel.score++;
                break;
            case 'd':
                if(mPanel.headY == mPanel.MAXCOL-2){
                    return true;
                }
                    mPanel.score++;
                break;
            case 'w':
                if (mPanel.headX == 1) {
                    return true;
                }
                    mPanel.score++;
                break;
            case 's':
                if (mPanel.headX == mPanel.MAXROW - 2) {
                    return true;
                }
                    mPanel.score++;
                break;
        }
        return false;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char c = e.getKeyChar();
//        switch (c){
//        case :
//        break;
//        }
//        System.out.println(c.);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

public class WDB {
    public static void main(String[] args) {
        new MyFrame3();
    }
}
