package book.ch22제네릭_컬렉션;


import java.util.Arrays;
import java.util.List;

public class 제네릭_542_상한와일드카드 {
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(22, 2, 3);
        System.out.println("sum" + sumOfList(li));
    }
}