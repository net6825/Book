package book.ch22제네릭_컬렉션;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class 컬렉션_567_Sort {
    public static void main(String[] args) {
        List<String> li = new LinkedList<String>();
        li.add("김철수");
        li.add("김영희");
        Collections.sort(li);
        System.out.println(li);

        String[] sample = {"i", "walk", "the", "line"};
        List<String> list = Arrays.asList(sample);
        Collections.sort(list);
        System.out.println(list);
    }
}