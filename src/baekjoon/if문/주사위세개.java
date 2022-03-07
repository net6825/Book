package baekjoon.if문;
/**
 * 같은 눈3 = 10000+같은눈*1000
 * 같은 눈2 = 1000+같은눈*100
 * 다른눈 = 가장큰눈*100
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주사위세개 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && b == c)
            System.out.print(10000 + a * 1000);
        else if (a == b || a == c)
            System.out.print(1000 + a * 100);
        else if (b == c)
            System.out.print(1000 + b * 100);
        else
            System.out.print((Math.max(Math.max(a, b), c) * 100));
    }
}

