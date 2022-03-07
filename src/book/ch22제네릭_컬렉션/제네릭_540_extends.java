package book.ch22제네릭_컬렉션;

public class 제네릭_540_extends {
    public static <T /*제한 하는 것 */ extends Comparable> T getMax(T[] a) {
        if (a == null || a.length == 0)
            return null;
        T largest = a[0];
        for (int i = 1; i < a.length; i++)
            if (largest.compareTo(a[i]) > 0)
                largest = a[i];
        return largest;
    }

/* 540p 중간점검 2번문제
public <T> void displayArray(T[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
*/
}
