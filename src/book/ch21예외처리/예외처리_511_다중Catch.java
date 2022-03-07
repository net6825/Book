package book.ch21예외처리;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class FileError {
    private int[] list;
    public static final int SIZE = 10;

    public FileError() {
        list = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            list[i] = i;
            writeList();
        }
    }

    public void writeList() {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));
            for (int i = 0; i < SIZE; i++) {
                out.println("배열원소 " + i + " = " + list[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException");
        } catch (IOException e) {
            System.err.println("IOException");
        } finally {
            if (out != null)
                out.close();
        }
    }
}

public class 예외처리_511_다중Catch {

    public static void main(String[] args) {
        new FileError();
    }
}
