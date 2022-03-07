package school.java.network._11_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Wdb2 {
    public static void main(String[] args) {
        //서버에 접속하여 자신의 이름을 보낸다

        // 1. 소켓 객체를 생성한다.
        try {
            Socket s = new Socket("10.30.4.181", 5555);
            // 2. 소켓 객체로부터 서버에 데이터를 보내기(출력)위한 printWriter 객체를 생성
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            // 3. PrintWriter 객체에 이름을 보낸다.
            out.println("ABC");

            // 4. 서버에서 보낸 데이터를 받기 위해 BufferedReader 객체를 생성한다
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String data=br.readLine();
            System.out.println(data);
            // 5. BufferedReader 객체로 데이터를 읽고 출력한다.

            out.close();
            br.close();
            s.close();
            // 6. 소켓을 닫는다.
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
