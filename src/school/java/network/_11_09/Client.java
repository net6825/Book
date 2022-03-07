package school.java.network._11_09;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1. 소켓 생성
        Socket socket = new Socket("172.26.3.41", 5555);
        OutputStream os = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os);
        while (true) {
            // 2. 키보드 입력 받음
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String data = in.readLine();
        // 3. exit 메시지 나오면 종료, else 데이터 전송
            if (data.equals("exit")) {
                break;
            } else {
                pw.println(data);
                pw.flush();
            }
        }
        // 4. Socket 종료
        pw.close();
        socket.close();
    }
}
