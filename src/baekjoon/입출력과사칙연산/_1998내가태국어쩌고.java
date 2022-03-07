package baekjoon.입출력과사칙연산;

import java.io.*;

public class _1998내가태국어쩌고 {
    public static void main(String[] args) throws IOException {
        /**
         * 우리나라는 그대로
         * 태국은 불멸기원 사용
         * ex) 한국 1998 => 태국 2541  차이 543
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n-543);
    }
}