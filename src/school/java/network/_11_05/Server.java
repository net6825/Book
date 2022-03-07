package school.java.network._11_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        try{
            serverSocket = new ServerSocket(4444);
            System.out.println("AAA");
            while(true){
                clientSocket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String inputLine;
                inputLine = in.readLine();
                System.out.println(inputLine);
                in.close();
                clientSocket.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
