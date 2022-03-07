package baekjoon.while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기사이클 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int copy = n;
//      n/10 = 10자리 n%10 = 1자리
        while (true) {
            n = (((n % 10) * 10) + ((n / 10) + (n % 10)) % 10);
            cnt++;
            if (copy == n) {
                System.out.println(cnt);
                break;
            }
        }
    }
}
