package baekjoon.배열1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max=0;
        int count=0;
        for (int i = 0; i < 9; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a>max){
                max=a;
                count=i+1;
            }
        }
        System.out.print(max+" \n"+count);
    }
}
