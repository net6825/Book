package book.ch24_입출력스트림;

import java.io.*;

public class 스트림_643_EXERCISE5 {
    public static void main(String[] args) throws Exception {
        DataInputStream in = null;
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("스트림ex5.txt")));

            out.writeInt(1);
            out.writeShort(1);
            out.writeFloat(1.1F);
            out.writeDouble(1.1);

            out.flush();

            in = new DataInputStream(new BufferedInputStream(new FileInputStream("스트림ex5.txt")));

            System.out.println(in.readInt());
            System.out.println(in.readShort());
            System.out.println(in.readFloat());
            System.out.println(in.readDouble());
        } finally {
            in.close();
            out.close();
        }
    }
}
