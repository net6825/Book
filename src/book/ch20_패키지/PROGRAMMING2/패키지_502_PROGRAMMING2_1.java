package book.ch20_패키지.PROGRAMMING2;

import java.util.Scanner;

public class 패키지_502_PROGRAMMING2_1 {
    //컴터 0~2 난수 생성
//    0은 가위 1은 바위 2 는 보
    패키지_502_PROGRAMMING2_1() {
        int com;
        com = (int) (Math.random() * 3 + 1);

        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("하나를 선택하시오:가위(0), 바위(1),보(2)");
        input = sc.nextInt();

        if (com == 0) {
            System.out.println("컴퓨터는 가위");
            if (input == 0) {
                System.out.println("당신은 가위");
                System.out.println("비겼습니다");
            }
            if (input == 1) {
                System.out.println("당신은 바위");
                System.out.println("당신 이김");
            }
            if (input == 2) {
                System.out.println("당신은 보");
                System.out.println("당신이 짐");
            }
        }
        if (com == 1) {
            System.out.println("컴퓨터는 바위");
            if (input == 0) {
                System.out.println("당신은 가위");
                System.out.println("당신이 짐");
            }
            if (input == 1) {
                System.out.println("당신은 바위");
                System.out.println("비김");
            }
            if (input == 2) {
                System.out.println("당신은 보");
                System.out.println("당신이 이김");
            }
        }
        if (com == 2) {
            System.out.println("보");
            if (input == 0) {
                System.out.println("당신은 가위");
                System.out.println("이김");
            }
            if (input == 1) {
                System.out.println("당신은 바위");
                System.out.println("짐");
            }
            if (input == 2) {
                System.out.println("당신은 보");
                System.out.println("비김");
            }
        }
    }
}
