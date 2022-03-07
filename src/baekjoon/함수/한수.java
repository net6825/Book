package baekjoon.함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 한수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        han(n);

        System.out.println(han(n));
    }

    public static int han(int num){
        int cnt=0;
        if(num<100) return num;
        else{
            cnt=99;
            if(num<=999){
                
            }
        }
        return 0;
    }
}
// while(true) {
//         if(a==0) {
//         break;
//         }
//         int a=n%10;
//
//         }