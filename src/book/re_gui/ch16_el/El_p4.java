package book.re_gui.ch16_el;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MPanel extends JPanel implements ActionListener {
    JButton lb, rb;
    static int x = 180;

    public MPanel() {
        setLayout(new FlowLayout());
        lb = new JButton("왼쪽으로 이동");
        rb = new JButton("오른쪽으로 이동");
        lb.addActionListener(this);
        rb.addActionListener(this);
        add(lb);
        add(rb);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 400, 130);
        g.setColor(Color.RED);
        g.fillRect(this.x, 30, 20, 80);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("왼쪽으로 이동")) x -= 10;
        else if (e.getActionCommand().equals("오른쪽으로 이동")) x += 10;
        repaint();
    }
}

class MFrame extends JFrame {
//    JButton lb, rb;

    public MFrame() {
        setTitle("Programming 4");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MPanel m = new MPanel();
        add(m);
        requestFocus();
        addKeyListener(new MKeyListener());
        setVisible(true);
    }
}

class MKeyListener extends KeyAdapter {
    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            MPanel.x -= 10;
            System.out.println("AA");
        }
    }
}

public class El_p4 {
    public static void main(String[] args) {
        new MFrame();
    }
}
