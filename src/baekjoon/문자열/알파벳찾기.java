package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳찾기 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String s = br.readLine();
//        int[] arr = new int[25];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=-1;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (arr[c - 'a'] == -1) {
//                arr[c-'a']=i;
//            }
//        }
//        for (int val : arr) {
//            System.out.print(val+" ");
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        for (char c = 'a' ; c <= 'z' ; c++){
            System.out.print(word.indexOf(c) + " ");
        }
    }
}
