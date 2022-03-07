package school.java.gui_thread._10_12_g_t;

import javax.swing.*;
import java.awt.*;

class MFrame extends JFrame{
    JLabel label;

    class MyThread extends Thread{
        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 10; i++) {
                label.setText("" + (9 - i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            label.setText("끝");
        }
    }
    public MFrame(){
        setTitle("카운트 다운");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("START");
        label.setFont(new Font("Serif",Font.BOLD,50));
        add(label);

        MyThread thread = new MyThread();
        thread.start();

        setVisible(true);
    }
}

public class WebDB2 {
    public static void main(String[] args) {
        MFrame f = new MFrame();

    }
}
