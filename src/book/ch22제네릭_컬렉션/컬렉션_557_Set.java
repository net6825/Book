package book.ch22제네릭_컬렉션;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class 컬렉션_557_Set {
    public static void main(String[] args) {
        //Set에는 HashSet, TreeSet, LinkedHashSet 세가지가 있음
        HashSet<String> Hashset = new HashSet<String>();

        Hashset.add("Milk");
        Hashset.add("Bread");
        Hashset.add("Butter");
        Hashset.add("Cheese");
        Hashset.add("Ham");
        Hashset.add("Ham");

        System.out.println("HashSet : " + Hashset);


//      입력한 순서대로 정렬
        LinkedHashSet<String> Linkedset = new LinkedHashSet<String>();

        Linkedset.add("Milk");
        Linkedset.add("Bread");
        Linkedset.add("Butter");
        Linkedset.add("Cheese");
        Linkedset.add("Ham");
        Linkedset.add("Ham");

        System.out.println("LinkedSet : " + Linkedset);

        //알파벳 순으로 정렬Li
        TreeSet<String> Treeset = new TreeSet<>();

        Treeset.add("Milk");
        Treeset.add("Bread");
        Treeset.add("Butter");
        Treeset.add("Cheese");
        Treeset.add("Ham");
        Treeset.add("Ham");
        System.out.println("TreeSet : " + Treeset);
    }
}
