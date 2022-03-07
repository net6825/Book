package baekjoon.for문;

import java.io.*;

public class 별찍기_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder st = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
//                bw.write(" ");
                st.append(" ");
            }
            for (int j = 1; j <= i; j++) {
//                bw.write("*");
                st.append("*");
            }
//            bw.newLine();
            st.append("\n");
        }
        System.out.println(st);
//        bw.flush();
//        bw.close();
    }
}
