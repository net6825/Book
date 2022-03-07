package school.java.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _10_29 {

    public static void main(String[] args) throws IOException {

        FileOutputStream out = null;
        out = new FileOutputStream("out.txt");

        int c = 9;
        out.write(c);
        c = 10;
        out.write(c);
        c = 13;
        out.write(c);
        out.close();
        fr();
        }
    static void fw(){

    }
    static void fr() throws IOException {
        FileInputStream in;
        in = new FileInputStream("out.txt");
        int c;
        while(in.read()!=-1){
            c = in.read();
            System.out.println(c);
        }
    }
}

