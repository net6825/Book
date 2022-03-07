package book.ch22제네릭_컬렉션;

import java.util.ArrayList;

public class 컬렉션_551_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        list.add(1, "APPLE");
        list.set(2, "GRAPE");
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//      위와 같은 방법인 foreach이고 보통 foreach를 많이 씀
//      get()의 사용법을 알려주기 위해서 일반 for문 사용
//        for (String s : list) {
//            System.out.println(s);
//        }
    }
}