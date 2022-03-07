package 자바의정석;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 익명클래스 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            // 익명 클래스는 이름이 없으므로 조상 클래스나 인터페이스 이름이 바로 들어감
            // 클래스의 정의와 객체 생성을 동시에 해줌줌
           @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action occured");
            }
        });
    }
}
