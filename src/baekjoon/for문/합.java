package baekjoon.for문;

import java.io.*;

public class 합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int total=0;

        for (int i = 1; i <= n; i++) {
            total+=i;
        }
        System.out.println(total);
    }
}
