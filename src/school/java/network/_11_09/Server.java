package school.java.network._11_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

class Client1 extends Thread {
    Socket socket;
    public Client1(Socket s) {
        socket = s;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        try {
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String inLine = null;
            while( (inLine= br.readLine()) != null) {
                System.out.print(socket.getInetAddress() + ":");
                System.out.println(inLine);
                if (inLine.equals("exit")) {
                    break;
                }
            }
            socket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5555);
            System.out.println("서버 시작 포트번호 5555");
            Socket socket = null;
            while( (socket = serverSocket.accept())!= null) {
                Client1 client= new Client1(socket);

                client.start();

            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}