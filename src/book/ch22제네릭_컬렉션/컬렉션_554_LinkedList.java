package book.ch22제네릭_컬렉션;

import java.util.Iterator;
import java.util.LinkedList;

public class 컬렉션_554_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        list.add(1,"APPLE");
        list.set(2, "GRAPE");
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Iterator e = list.iterator();
        String first = (String) e.next();
        String second = (String) e.next();
        e.remove();
        System.out.printf(first+"\n"+second);
    }
}
