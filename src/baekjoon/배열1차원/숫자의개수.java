package baekjoon.배열1차원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의개수 {
    public static void main(String[] args) throws IOException {
/*      나머지 나누기 연산으로 시간 줄인 코드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int val = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        while(val!=0) {
            arr[val%10]++;
            val/=10;
        }
        for(int result : arr) {
            System.out.println(result);
        }
*/

/*      내가 짠 코드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int total = a*b*c;
        String str = String.valueOf(total);

        char arr[] = new char[10];
        int numbers[] = new int[10];
        for (int i = 0; i < str.length(); i++) {
            arr[i]= str.charAt(i);
            switch (arr[i]){
                case '0': numbers[0]++; break;
                case '1': numbers[1]++; break;
                case '2': numbers[2]++; break;
                case '3': numbers[3]++; break;
                case '4': numbers[4]++; break;
                case '5': numbers[5]++; break;
                case '6': numbers[6]++; break;
                case '7': numbers[7]++; break;
                case '8': numbers[8]++; break;
                case '9': numbers[9]++; break;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
*/

    }
}
