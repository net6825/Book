package baekjoon.for문;

import java.io.*;

public class 기찍N {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i=n; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
