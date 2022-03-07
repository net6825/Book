package school.java.gui_thread._09_28_g;

import javax.swing.*;
import java.awt.*;

class 밉다 extends JPanel{
    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        g.setColor(Color.WHITE);
        g.fillRect(50, 50, 200, 200);
        g.drawString("ㅇ리마ㅓㄴㅇ;리ㅏㄴ머",50,50);
        System.out.println("dfkajsdf");
    }
}

class 세진프레임 extends JFrame{
    public 세진프레임(){
        setTitle("ㅋㅋㅋ");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        밉다 미워 = new 밉다();
        add(미워);
        setVisible(true);
    }
}

public class 세진이가밉다 {
    public static void main(String[] args) {
        세진프레임 f = new 세진프레임();
    }
}
