package book.ch21예외처리;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 예외처리_526_LAB {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("data.txt"));         //파일과 디렉터리 다루는 메소드
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
/*
public class 예외처리_526_LAB {
    public static void main(String[] args) throws FileNotFoundException {
            Scanner in = new Scanner(new File("data.txt"));
    }
}
*/
