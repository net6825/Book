package baekjoon.if문;

import java.util.Scanner;

public class 오븐시계 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int m = sc.nextInt();
            int t = sc.nextInt();

            h += t / 60;            // 시간 더하기 위해서 분을 60으로 나눔 그러면 60을 넘으면 시간이 1시간 추가
            m += t % 60;            // 분을 더하기 위해서 분을 60으로 나눈 나머지로 분에 더해줌

            if(m >= 60){
                h += 1;
                m -= 60;
            }
            if(h >= 24){
                h -= 24;
            }

            System.out.println(h + " " + m);
        }
    }
