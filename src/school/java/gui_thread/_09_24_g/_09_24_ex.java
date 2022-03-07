package school.java.gui_thread._09_24_g;

import javax.swing.*;
import java.awt.*;

public class _09_24_ex extends JFrame {
    public _09_24_ex(){
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel P = new JPanel();
        JPanel p1 = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new FlowLayout());
        JPanel p3 = new JPanel(new GridLayout(2,2,5,5));

        JLabel login = new JLabel("로그인 화면");
        JLabel id = new JLabel("id");
        JLabel pw = new JLabel("pw");

        JTextField t1 = new JTextField(3);
        JTextField t2 = new JTextField(3);

        JButton b1 = new JButton("확인");
        JButton b2 = new JButton("취소");
        JButton b3 = new JButton("생성");
        JButton b4 = new JButton("탈퇴");

        p1.add(login);
        p2.add(id);
        p2.add(t1);
        p2.add(pw);
        p2.add(t2);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);

        P.add(p1);
        P.add(p2);
        P.add(p3);

        this.add(P);

        setVisible(true);
    }
    public static void main(String[] args) {
        new _09_24_ex();
    }
}
