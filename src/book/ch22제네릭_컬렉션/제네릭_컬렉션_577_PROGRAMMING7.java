package book.ch22제네릭_컬렉션;

import java.util.HashSet;

public class 제네릭_컬렉션_577_PROGRAMMING7 {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<Integer>();
        int num;
        for (int i = 0;  list.size()<6; i++) {
            num = (int) (Math.random()*44+1);
            if (!list.contains(num)) {
                list.add(num);
            }
        }
            System.out.println("Lotto [set ="+list+"]");
    }
}
