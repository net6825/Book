package book.ch24_입출력스트림;

import java.io.*;

public class 스트림_622_버퍼스트림 {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("input.txt"));  //스트림을 다른 스트림과 연결
            //fileReader 출력이 BufferReader 입력과 서로 연결됨
            outputStream = new PrintWriter(new FileWriter("output.txt"));

            String l;
            while ((l = inputStream.readLine())!= null) {
                outputStream.println(l);
            }
        }finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
