package book.ch16_이벤트처리;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class MyPanel extends JPanel {
    BufferedImage img = null;
    int img_x = 100, img_y = 100;

    public MyPanel() {
        try {
            img = ImageIO.read(new File("car.gif"));
        } catch (IOException e) {
            System.out.println("no image");
            System.exit(1);
        }
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP:
                        img_y -= 10;
                        break;
                    case KeyEvent.VK_DOWN:
                        img_y += 10;
                        break;
                    case KeyEvent.VK_LEFT:
                        img_x -= 10;
                        break;
                    case KeyEvent.VK_RIGHT:
                        img_x += 10;
                        break;
                }
                repaint();
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        this.requestFocus();
        setFocusable(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, img_x, img_y, null);
    }
}

public class 이벤트처리_406_CarGame extends JFrame {
    public 이벤트처리_406_CarGame() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new MyPanel());
        setVisible(true);
    }

    public static void main(String[] args) {
        이벤트처리_406_CarGame s = new 이벤트처리_406_CarGame();
    }
}
