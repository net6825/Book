package book.ch22제네릭_컬렉션;

import java.util.ArrayList;
import java.util.Iterator;

public class 컬렉션_552_반복자 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("하나");
        list.add("둘");
        list.add("셋");
        list.add("넷");

        String s;
        Iterator e = list.iterator();
        while (e.hasNext()) {
            s = (String) e.next();      //반복자는 Object 타입을 반환하므로 객체타입임 So 기초자료형인 String으로 변환해줘야함?
            System.out.println(s);
        }
    }
}