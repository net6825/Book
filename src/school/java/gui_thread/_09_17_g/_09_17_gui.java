package school.java.gui_thread._09_17_g;

import javax.swing.*;

public class _09_17_gui {
    public static void main(String[] args) {
        // 1. 최상위 컨테이너 객체 JFrame 생성
        JFrame f = new JFrame("프레임 생성");
        // 1.1 프레임의 속성 설정( 사이즈, 종료시 수행할 방법)
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 타이틀 변경
        f.setTitle("이지석");
        // 1.2 프레임을 보이도록 속성 설정
        f.setVisible(true);
    }
}
