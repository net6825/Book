package book.ch24_입출력스트림;


import java.util.*;
import java.io.*;

public class 스트림_626_Scanner2 {
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        double sum = 0;
        PrintWriter out = null;

        out = new PrintWriter(new FileWriter("output.txt"));
        out.println("9.5");
        out.println("567,000");
        out.flush();        //fileWriter 내부 버퍼의 내용을 파일에 write flush호출 X 시 버퍼에만 남고 파일에는 안쓰임
        s = new Scanner(new BufferedReader(new FileReader("output.txt")));
        while (s.hasNext()) {
            if(s.hasNextDouble()){
                sum += s.nextDouble();
            }else {
                s.next();
            }
        }
        if(out!=null)
            out.close();
        if(s != null)
            s.close();
        System.out.println(sum);
    }
}