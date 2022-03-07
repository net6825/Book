package book.ch22제네릭_컬렉션;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1> {
    int number;
    String name;

    public Student1(int number, String name) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Student1 s) {
        return number - s.number;
    }
}

public class 컬렉션_568_Sort2 {
    public static void main(String[] args) {
        Student1 array[] = {
                new Student1(20090001, "김철수"),
                new Student1(20090002, "이철수"),
                new Student1(20090003, "박철수"),
        };
        List<Student1> list = Arrays.asList(array);
        Collections.sort(list);
//      역순 정렬
//      Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
