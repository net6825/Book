package book.ch20_패키지;

import java.util.Calendar;
import java.util.StringTokenizer;

public class 패키지_501_Exercise5 {
    public static void main(String[] args) {
        // 5.1번 0~100사이 난수 하나 생성
        int r = (int) (Math.random() * 100);

        //5.2번 번호를 StringTokenizer로 각 부분으로 나누기
        StringTokenizer st = new StringTokenizer("080-2-777-5566", "-");
        while (st.hasMoreElements())
            System.out.println(st.nextToken());

        //5.3번 오늘 날짜 출력
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        //5.4번 패키지_501_Exercise5클래스의 객체를 생성하고 객체를통하여 생성한 클래스의 이름을 출력
        패키지_501_Exercise5 in = new 패키지_501_Exercise5();
        System.out.println(in.getClass().getName());

        //5.5번 0~90도까지 5도씩 증가하며 싸인값을 출력하는 루프를 작성
        for (int i = 0; i < 90; i += 5) {
            System.out.println(Math.sin(Math.toRadians((double) i)));
        }
    }
}
