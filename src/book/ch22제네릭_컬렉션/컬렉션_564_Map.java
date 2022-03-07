package book.ch22제네릭_컬렉션;

import java.util.HashMap;
import java.util.Map;

class Student {
    int number;
    String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class 컬렉션_564_Map {
    public static void main(String[] args) {
        Map<String, Student> st = new HashMap<String, Student>();
        st.put("20090001", new Student(20090001, "구준표"));
        st.put("20090002", new Student(20090002, "금잔디"));
        st.put("20090003", new Student(20090003, "윤시후"));

        System.out.println(st);

        st.remove("20090002");

        st.put("20090003", new Student(2009003, "소이정"));
        System.out.println(st.get(20090003));

        //Map에 저장된 데이터 방문 시에는 Map.Entry 사용해야 함
        for (Map.Entry<String, Student> s : st.entrySet()) {
            String key = s.getKey();
            Student value = s.getValue();
            System.out.println("Key=" + key + ", value= " + value);
        }
    }
}
