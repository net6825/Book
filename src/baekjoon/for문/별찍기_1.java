package baekjoon.for문;


import java.io.*;

public class 별찍기_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
/**
 * BufferedReader와 StringBuilder로 풀기기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append('\n');
        }
        System.out.println(sb);*/


/**
*  for문으로 풀기

*        for (int i = 0; i < n; i++) {
*            for (int j = 0; j <= i; j++) {
*                System.out.print("*");
*            }
*            System.out.println();
*        }
*/