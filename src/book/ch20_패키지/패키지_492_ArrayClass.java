package book.ch20_패키지;

import java.util.Arrays;

public class 패키지_492_ArrayClass {
    public static void main(String[] args) {
        int[] array = {9, 4, 5, 6, 2, 1};
        Arrays.sort(array);     //1, 2, 4, 5, 6, 9로 정렬
        printArray(array);
        System.out.println(Arrays.binarySearch(array, 9));      //이진탐색으로 마지막에 있는 9찾음(index번호가 5)
        printArray(array);
    }

    private static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}
