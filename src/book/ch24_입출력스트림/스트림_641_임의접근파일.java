package book.ch24_입출력스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class 스트림_641_임의접근파일 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("압축 파일 이름을 입력하시오");
        String inname = sc.next();
        System.out.println("원본 파일 이름을 입력하시오");
        String outname = sc.next();
        ZipInputStream inStream = new ZipInputStream(
                new FileInputStream(inname));
        OutputStream outStream = new FileOutputStream(outname);

        byte[] buffer = new byte[1024];
        int read;
        ZipEntry entry;
        if ((entry = inStream.getNextEntry()) != null) {
            while ((read = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, read);
            }
        }
        outStream.close();
        inStream.close();
    }
}
