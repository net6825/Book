package book.ch22제네릭_컬렉션;

import java.util.Vector;

public class 컬렉션_545_Vector {
    public static void main(String[] args) {
        Vector vc = new Vector();
        vc.add("Hello World");
        vc.add(new Integer(10));
        vc.add(20);

        System.out.println("Vector Size: " + vc.size());

        for (Object l : vc) {
            System.out.println("Vector Elements: " + l);
        }
    }
}
