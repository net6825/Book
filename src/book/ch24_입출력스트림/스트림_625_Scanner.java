package book.ch24_입출력스트림;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class 스트림_625_Scanner {
    public static void main(String[] args) {
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if( s!=null){
                s.close();
            }
        }
    }
}
