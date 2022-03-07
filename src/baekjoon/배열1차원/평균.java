package baekjoon.배열1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());    //입력 갯수

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max=-1;
        double sum = 0;

        for (int i = 0; i < m; i++) {
            int val = Integer.parseInt(st.nextToken());

            if(val > max) {
                max = val;
            }
            sum+=val;
        }
        System.out.println(((sum/max)*100)/m);
    }
}