package school.java.network._11_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Wdb {
    public static void main(String[] args) {
        URL naver = null;
        try {
            naver = new URL("https://www.naver.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            URLConnection nc = naver.openConnection();
            InputStream is = nc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String data;

            while((data = br.readLine()) !=null){
                System.out.println(data);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
