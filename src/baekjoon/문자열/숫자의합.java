package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int n = 0;

        for (byte val : br.readLine().getBytes()) {
            n += (val-'0');
        }
        System.out.println(n);
    }
}
