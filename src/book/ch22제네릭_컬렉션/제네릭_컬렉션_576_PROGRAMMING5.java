package book.ch22제네릭_컬렉션;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 제네릭_컬렉션_576_PROGRAMMING5 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        double score=0;
        double sum=0;
        for (int i = 0; i < 10; i++) {
            System.out.print("심사위원의 점수:");
            score=sc.nextDouble();
            list.add(score);
        }
        Collections.sort(list);

        for (int i = 0; i < 10; i++) {
            if(list.get(i)!=0.0 && list.get(i)!=10.0 )
            sum += list.get(i);
        }
        System.out.println("점수의 합: "+sum);
    }
}