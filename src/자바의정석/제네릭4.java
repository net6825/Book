package 자바의정석;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    String name="";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no =no ;
    }
}

public class 제네릭4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));

        Iterator<Student> it = list.iterator();
        while(it.hasNext()) {
            Student s = it.next();
            System.out.println(s.name);
//          아래와 위는 동일한 코드
            System.out.println(it.next().name);
        }
    }
}
