package 자바의정석;


import java.util.HashMap;

class Student33{
    String name="";
    int ban;
    int no;
    int eng;
    int kor;
    int math;

    Student33(String name, int ban, int no,int eng, int kor, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no ;
        this.eng = eng ;
        this.kor = kor ;
        this.math = math ;
    }
}

public class 제네릭5 {
    public static void main(String[] args) {
        HashMap<String, Student33> map = new HashMap<String, Student33>();
        map.put("자바왕",new Student33("자바왕", 1, 1,100,100,100));

        Student33 ss = map.get("자바왕");

        System.out.println(ss.name);
    }
}
