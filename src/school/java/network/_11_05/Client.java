package school.java.network._11_05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        //서버에 접속하여 자신의 이름을 보낸다.
        try {
            // 1. 소켓 객체를 생성한다.
            try {
                while(true){
                    System.out.println("AAAAAAAAAA");
                Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Socket s = new Socket("10.30.4.181", 5555);
            // 2. 소켓 객체로부터 서버에 데이터를 보내기 (출력)위한 PrintWriter 객체를 생성
            PrintWriter out = new PrintWriter(s.getOutputStream());
            // 3. PrintWriter 객체에 이름을 보낸다.
            out.println("LJS");
            out.flush();
            // 4. 소켓을 닫는다.
            out.close();
            s.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}