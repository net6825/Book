package book.ch22제네릭_컬렉션;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 컬렉션_569_Shuffle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++)
            list.add(i);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
