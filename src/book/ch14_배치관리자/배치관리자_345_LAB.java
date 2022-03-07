package book.ch14_배치관리자;

import java.awt.*;
import javax.swing.*;

class MyFrame5 extends JFrame {
    JPanel p1;

    public MyFrame5() {
        setSize(300, 200);
        setTitle("My Frame");
        p1 = new JPanel();
        p1.setLayout(new FlowLayout()); //패널의 레이아웃을 FlowLayout으로 설정

        //반복문을 이용하여 버튼 객체를 10개 생성하여 패널에 추가
        for (int i = 0; i < 10; i++) {
            p1.add(new JButton("Button" + i));
            add(p1);
        }
        setVisible(true);
    }
}

public class 배치관리자_345_LAB {
    public static void main(String[] args) {
        MyFrame5 f = new MyFrame5();
    }
}



