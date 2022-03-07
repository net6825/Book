package book.ch22제네릭_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;

public class 제네릭_컬렉션_575_EXERCISE_6 {
    public static void main(String[] args) {
        String[] s = {"사과", "배", "바나나"};
        ArrayList<String> ls = new ArrayList(Arrays.asList(s));

        ls.add("포도");
        ls.add(2, "자몽");
        ls.remove(1);
        System.out.println(ls);
        System.out.println(ls.get(3));
        System.out.println(ls.contains("사과"));
        System.out.println(ls.indexOf("사과"));
    }
}
