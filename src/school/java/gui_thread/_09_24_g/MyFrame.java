package school.java.gui_thread._09_24_g;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("이지석");

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage("C:\\.png");
        this.setIconImage(img);

        Dimension screenSize = kit.getScreenSize();
//        setLocation(screenSize.width / 2, screenSize.height / 2);
        setLocationRelativeTo(null);    //화면 정중앙에 띄움

//        JButton btn = new JButton("확인");
//
//        FlowLayout layout = new FlowLayout();
//        this.setLayout(layout);
//
//        this.add(btn);

        // 1. 패널 생성
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        // 2. 패널에 들어갈 컴포넌트 생성
        JLabel label = new JLabel();
        label.setText("안녕하세요");

        JButton btn1 = new JButton("확인");
        JButton bn = new JButton("NORTH");
        JButton bs = new JButton("SOUTH");
        JButton be = new JButton("EAST");
        JButton bw = new JButton("WEST");
        btn1.setEnabled(false);

        JButton btn2 = new JButton("취소");

        JTextField t1 = new JTextField(15);
        t1.setText("웹데이터베이스전공");

        JButton[] buttons = new JButton[12];
        for (int i = 0; i < 12; i++) {
            buttons[i] = new JButton("버튼" + (i+1));
        }
        // 3. 생성된 컴포넌트를 패널에 추가(레이아웃도 추가)
        FlowLayout f = new FlowLayout(FlowLayout.CENTER, 20, 5);
        panel.setLayout(f);
        panel.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        BorderLayout borderLayout = new BorderLayout();
        panel2.setLayout(borderLayout);

        GridLayout gridLayout = new GridLayout(4, 3);
        panel3.setLayout(gridLayout);
        for (int i = 0; i < 12; i++) {
            panel3.add(buttons[i]);
        }

        panel.add(label);
        panel.add(btn1);
        panel.add(btn2);
        panel2.add(t1);
        panel2.add(t1, BorderLayout.CENTER);
        panel2.add(bn, BorderLayout.NORTH);
        panel2.add(bs, BorderLayout.SOUTH);
        panel2.add(be, BorderLayout.EAST);
        panel2.add(bw, BorderLayout.WEST);

        // 4. 완료된 패널을 프레임에 추가(레이아웃도 추가)
        this.setLayout(new FlowLayout());
        this.add(panel);
        this.add(panel2);
        this.add(panel3);
        setVisible(true);
    }
}
