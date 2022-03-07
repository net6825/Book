package book.ch21예외처리;

import java.util.Scanner;

public class 예외처리_506_ArithmeticException {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("피젯수: ");
        x = sc.nextInt();
        System.out.println("젯수: ");
        y = sc.nextInt();
        try {
            //예외가 발생할 수도 있는 문장
            int result = x / y;
        } catch (ArithmeticException e) {           //0으로 나누면 오류뜨는거 해결하는것 ArithmeticException
            System.out.println("0");
        }
        System.out.println("프로그램 종료");
    }
}
