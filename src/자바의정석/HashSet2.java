package 자바의정석;

import java.util.HashSet;
import java.util.Objects;

class Person22 {
        String name;
        int age;

        Person22(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String toString() {
            return name + ":" + age;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person22)) return false;
        Person22 person22 = (Person22) o;
        return age == person22.age && name.equals(person22.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

// hashCode와 equals를 통해서 반복되는 객체도 없앰
public class HashSet2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add(new Person22("David", 10));
        set.add(new Person22("David", 10));
        System.out.println(set);
    }
}
