package book.ch22제네릭_컬렉션;

import java.util.ArrayList;
import java.util.Iterator;

public class 제네릭_컬렉션_575_EXERCISE_7 {
    public static void main(String[] args) {
    ArrayList<Double> list = new ArrayList<Double>();
        list.add(1.1); list.add(1.2); list.add(1.3); list.add(1.4);

//        EXERCISE 7-1
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//      EXERCISE 7-2
        for (Double d: list) {
            System.out.println(d);
        }

//      EXERCISE 7-3
        Iterator e = list.iterator();
        while (e.hasNext()) {
            System.out.println(e.next());
        }
    }
}
