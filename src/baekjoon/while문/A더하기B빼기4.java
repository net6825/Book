package baekjoon.while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A더하기B빼기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;
        while((str=br.readLine())!=null){
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");
        }
            System.out.println(sb);
    }
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            StringBuilder sb = new StringBuilder();
//            StringTokenizer st;
//            String s;
//
//            while ((s = br.readLine()) != null) {           //EOF라고 하고 더이상 입력이 없을때 끝내는 방법을 말함(End of File)
//                st = new StringTokenizer(s);
//                int a = Integer.parseInt(st.nextToken());
//                int b = Integer.parseInt(st.nextToken());
//                sb.append(a + b).append("\n");
//            }
//            System.out.println(sb);
//        }
//    }
}