package book.ch21예외처리;

import java.util.Scanner;

class NotFoundException extends Exception {
    NotFoundException() {
        super("배열을 찾을 수 없음");
    }
}

public class 예외처리_534_PROGRAMMING3 {
    public static int searchArray(int array[], int data) throws NotFoundException {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        throw new NotFoundException();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int data = sc.nextInt();
        try {
            searchArray(a, data);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
    }
}
