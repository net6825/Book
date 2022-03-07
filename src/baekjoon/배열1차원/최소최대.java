package baekjoon.배열1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최소최대 {
    public static void main(String[] args) throws IOException {

    }
}
/* BufferedReader 사용 & sort 사용
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idx=0;
        int arr [] = new int[n];
        while(st.hasMoreTokens()){
            arr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[n-1]);
*/
/* Scanner 사용 & max,min 사용
Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int small = 1000000, big = -1000000;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a > big) {
                big = a;
            }
            if (a < small) {
                small = a;
            }
        }
        System.out.println(small + " " + big);
*/