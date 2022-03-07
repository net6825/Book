package book.re_gui.ch15_gp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Gp_381 extends JFrame implements ActionListener {

    BufferedImage img;
    private int pieces = 4;
    private int totalPieces = pieces * pieces;
    private int[] pieceNumber;

    public Gp_381() {
        setTitle("Image Draw Test");
        try {
            img = ImageIO.read(new File("C:\\Users\\net68\\IdeaProjects\\Book\\src\\book.re_gui\\ch15_gp\\img\\game1.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
        pieceNumber = new int[totalPieces];
        for (int i = 0; i < totalPieces; i++) {
            pieceNumber[i] = i;
        }
        add(new MyPanel3(), BorderLayout.CENTER);
        JButton button = new JButton("DIVIDE");
        button.addActionListener(this);
        add(button, BorderLayout.SOUTH);
        setSize(600, 600);
        setVisible(true);
    }

    void divide() {
        Random random = new Random();
        int ri;
        for (int i = 0; i < totalPieces; i++) {
            ri = random.nextInt(totalPieces);
            int tmp = pieceNumber[i];
            pieceNumber[i] = pieceNumber[ri];
            pieceNumber[ri] = tmp;
        }
    }

    private class MyPanel3 extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int pieceWidth = img.getWidth(null) / pieces;
            int pieceHeight = img.getHeight(null) / pieces;
            for (int x = 0; x < pieces; x++) {
                int sx = x * pieceWidth;
                for (int y = 0; y < pieces; y++) {
                    int sy = y * pieceHeight;
                    int number = pieceNumber[x * pieces + y];
                    int dx = (number / pieces) * pieceWidth;
                    int dy = (number % pieces) * pieceHeight;
                    g.drawImage(img, dx, dy, dx + pieceWidth, dy + pieceHeight, sx, sy, sx + pieceWidth, sy + pieceHeight, null);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Gp_381();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        divide();
        repaint();
    }
}
