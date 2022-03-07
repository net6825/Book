package book.ch22제네릭_컬렉션;

import java.util.List;

public class 제네릭_544_하한와일드카드 {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }
}
