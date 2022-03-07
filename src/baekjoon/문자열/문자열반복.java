package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 문자열반복 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int r = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int t = Integer.parseInt(br.readLine());
//
//    String s[] = br.readLine().split(" ");
//    int r = Integer.parseInt(s[0]);
//
//        for (int i = 0; i < t; i++) {
//
//        }