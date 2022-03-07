package school.java.gui_thread._10_15_g_t;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyThread extends Thread {
    MyPanel panel;

    MyThread(MyPanel p){
        this.panel = p;
    }
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            int x, y;
            x = panel.headX;
            y = panel.headY;
            panel.rects[y][x].setColor(Color.red);

            switch (panel.direction){
                case 0: //위
                    panel.headX = panel.headX - 1;
                    break;
                case 1: //오
                    panel.headY = panel.headY + 1;
                case 2: //아래
                    panel.headX = panel.headX + 1;
                case 3: //왼
                    panel.headY = panel.headY - 1;
            }
            x = panel.headX;
            y = panel.headY;
            panel.rects[y][x].setColor(Color.blue);
            panel.repaint();
        }
    }
}

class MyRect3 {

    int x, y;
    int width, height;
    Color color;


    MyRect3(int x, int y, int width, int height, Color color) {
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


    public void setColor(Color color) {
        this.color = color;
    }
}


class MyListener implements KeyListener {
    MyPanel mPanel;

    // 생성자
    public MyListener(MyPanel p) {
        mPanel = p;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        int keyCode = e.getKeyCode();
        boolean control = e.isControlDown();
        System.out.println(c);

        // 다음 자리가 벽인지 체크한다.
        if (isWall(c) == false) {
            //
            mPanel.score++;
            // 먼저 기존의 지렁이 머리의 색깔을 배경으로 변경
//            mPanel.rects[mPanel.headY][mPanel.headX].setColor(Color.red);
            // 헤드 변경
            switch (c) {
                //0 : 위, 1 : 오, 2 : 아래, 3 : 왼
                case 'a':
                    mPanel.direction=3;
                    break;
                case 'd':
                    mPanel.direction=1;
                    break;
                case 'w':
                    mPanel.direction=0;
                    break;
                case 's':
                    mPanel.direction=2;
                    break;
            }
            // 새로운 머리 색깔 변경
//            mPanel.rects[mPanel.headY][mPanel.headX].setColor(Color.blue);
        }

        // 다시 강제로 그려주는 명령
        mPanel.repaint();
    }

    // 방향 키를 입력받아 다음 자리가 벽인지 체크하는 메소드
    private boolean isWall(char c) {
        switch (c) {
            case 'a': // 왼쪽
                if (mPanel.headY == 0) {
                    c='d';
                    return true;
                }
                break;
            case 'd': // 오른쪽
                if (mPanel.headY == mPanel.MAXCOL - 2) return true;
                break;
            case 'w': // 위쪽
                mPanel.headX = mPanel.headX - 1;
                break;
            case 's': // 아래쪽
                mPanel.headX = mPanel.headX + 1;
                break;
        }
        return false;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
    }


    @Override
    public void keyReleased(KeyEvent e) {

        // TODO Auto-generated method stub


    }
}


class MyPanel extends JPanel {
    static int score = 0;
    static int MAXROW = 15;
    static int MAXCOL = 15;
    static MyRect3[][] rects; // panintComponent에서 접근하기 위해 멤버 변수로 설정
    int headX = MAXCOL / 2;
    int headY = MAXROW / 2;
    int direction;        //0 : 위, 1 : 오, 2 : 아래, 3 : 왼

    MyPanel() {
        // 사각형 객체를 생성한다.
        rects = new MyRect3[MAXROW][MAXCOL];
        for (int i = 0; i < MAXROW; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                if (i == 0 || i == MAXROW - 1 || j == 0 || j == MAXCOL - 1) {
                    rects[i][j] = new MyRect3(60 * i + 50, 60 * j + 50, 55, 55, Color.BLACK);
                } else {
                    rects[i][j] = new MyRect3(60 * i + 50, 60 * j + 50, 55, 55, Color.red);
                }
            }
        }
        // 지렁이 머리를 파랑색으로 설정한다.
        rects[headY][headX].setColor(Color.BLUE);

        // 키 리스너 등록
        MyListener listener = new MyListener(this);
        this.addKeyListener(listener);
        setFocusable(true);
    }


    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        for (int i = 0; i < MAXROW; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                rects[i][j].draw(g);
            }
        }
        g.setColor(Color.WHITE);
        g.setFont(new Font("굴림체", Font.BOLD, 30));
        g.drawString("" + score, 60, 80);
    }
}


class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("그래픽");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setLayout(new FlowLayout());
        MyPanel myPanel = new MyPanel();
        add(myPanel);

        setVisible(true);

        MyThread t = new MyThread(myPanel);
        t.start();
    }
}

public class Wdb {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
