package book.ch22제네릭_컬렉션;

import java.util.Arrays;
import java.util.List;

public class 제네릭_543_한도없는와일드카드 {
    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);
    }
}