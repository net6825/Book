package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] r = new int[26];
        String s = br.readLine();
        int max=-1;
        char t = '?';

        for (int i = 0; i < s.length(); i++) {
            if(65<=s.charAt(i) && s.charAt(i)<=90){
                r[s.charAt(i)-65]++;
            }
            else{
                r[s.charAt(i)-97]++;
            }
        }
        for (int i = 0; i < r.length; i++) {
            if(r[i]>max){
                max=r[i];
                t=(char)(i+65);
            }else if(r[i] == max){
                t = '?';
            }
        }
        System.out.println(t);
    }
}

//    public static void main(String[] args) throws IOException {
//        int[] arr = new int[26];
//        int c = System.in.read();
//        int max = -1;
//        int ch = -2;
//
//        while(c>64){
//            if(c<91){
//                arr[c-65]++;
//            }else{
//                arr[c-97]++;
//            }
//            c=System.in.read();
//        }
//
//        for (int i = 0; i < 26; i++) {
//            if(arr[i] >max) {
//                max = arr[i];
//                ch=i;
//            }else if (arr[i] == max){
//                ch=-2;
//            }
//        }
//        System.out.println((char)(ch+65));
//    }