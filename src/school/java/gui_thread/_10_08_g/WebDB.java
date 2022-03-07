package school.java.gui_thread._10_08_g;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyRect {
    int x, y;
    int width, height;
    Color color;

    MyRect(int x, int y, int width, int height, Color color) {
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

class MyListener implements KeyListener {
    MyPanel mPanel;

    public MyListener(MyPanel p) {
        mPanel = p;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.println(c);
        if(isWall(c) == false){
//            mPanel.rects[mPanel.headY][mPanel.headX].setColor(Color.BLUE);
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
//        mPanel.rects[mPanel.headY][mPanel.headX].setColor(Color.WHITE);

        //다시 강제로 그려주는 명령
        mPanel.repaint();
    }

    private boolean isWall(char c) {
        switch (c){
            case 'a':
                if(mPanel.headY==1) return true;
                break;
            case 'd':
                if(mPanel.headY == mPanel.MAXCOL-2) return true;
                break;
            case 'w':
                if(mPanel.headX == 1) return true;
                break;
            case 's':
                if(mPanel.headX == mPanel.MAXROW-2) return true;
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

class MyPanel extends JPanel {
    int MAXROW = 15;
    int MAXCOL = 15;
    MyRect[][] rects; //paintComponent에서 접근하기 위해 멤버 변수로 설정
    int headX = MAXCOL / 2;
    int headY = MAXROW / 2;

    MyPanel() {
        //사각형 객체를 생성한다.
        rects = new MyRect[MAXROW][MAXCOL];
        for (int i = 0; i < MAXROW; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                if (i == 0 || i == MAXROW - 1 || j == 0 || j == MAXCOL - 1) {
                    rects[i][j] = new MyRect(60 * i + 50, 60 * j + 50, 55, 55, Color.BLACK);
                } else {
                    rects[i][j] = new MyRect(60 * i + 50, 60 * j + 50, 55, 55, Color.BLUE);
                }
            }
        }
        rects[headY][headX].setColor(Color.white);

        MyListener listener = new MyListener(this);
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

    }
}

class MyFrame2 extends JFrame {
    Toolkit kit = Toolkit.getDefaultToolkit();

    public MyFrame2() {
        setTitle("지렁이게임");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension screenSize = kit.getScreenSize();
        setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);

        MyPanel myPanel = new MyPanel();
        add(myPanel);
        setVisible(true);
    }
}

public class WebDB {
    public static void main(String[] args) {
        MyFrame2 m = new MyFrame2();
    }
}