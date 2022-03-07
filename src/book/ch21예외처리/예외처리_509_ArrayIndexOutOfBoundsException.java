package book.ch21예외처리;

public class 예외처리_509_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int i = 0;
        try {
            for (i = 0; i <= array.length; i++) {
                System.out.println(array[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 " + i + "는 사용 불가");
        } finally {
            System.out.println("파이널리");
        }
    }
}