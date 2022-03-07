package baekjoon.배열1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균은넘겠지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int arr[];

        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            arr= new int[n];
            double sum=0;
            for (int j = 0; j < n; j++) {
                int val = Integer.parseInt(st.nextToken());
                arr[j]=val;
                sum+=val;
            }
            double avg = sum/n;         //각 줄의 평균
            double count=0;
            for (int j = 0; j < n; j++) {
                if(arr[j]>avg){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/n)*100);
        }
    }
}
//5
//5 50 50 70 80 100                       40.000%
//7 100 95 90 80 70 60 50                 57.143%
//3 70 90                                 33.333%
//3 70 90 81                              66.667%
//9 100 99 98 97 96 95 94 93 91           55.556%