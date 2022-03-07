package 자바의정석;

import java.util.ArrayList;

public class 제네릭 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add("30"); //String이 들어감

        Integer i = (Integer) list.get(2);      //컴파일 OK but runtime-error
        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(10);
        list2.add(20);
//      list2.add("30"); //컴파일 에러가 발생

//        Integer i2 = (Integer) list2.get(2);     //형 변환 생략해도 OK
        Integer i2 = list2.get(2);     //형 변환 생략해도 OK
        System.out.println(list);
    }
}
