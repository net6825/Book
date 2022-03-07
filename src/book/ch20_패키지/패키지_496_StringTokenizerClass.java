package book.ch20_패키지;

import java.util.StringTokenizer;

public class 패키지_496_StringTokenizerClass {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Will JAVA change my life?");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
