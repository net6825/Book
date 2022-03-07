package 자바의정석;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
//        Object[] objArr = {"1", new Integer(1), "2", "3", "3", "4", "4"};
//        Set set = new java.util.HashSet();
//
//        for (int i = 0; i < objArr.length; i++) {
//            System.out.println(set.add(objArr[i]));
//        }
//        System.out.println(set);
//
//        Iterator it = set.iterator();
//
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        Set set = new HashSet();

        for (int i = 0; set.size()<6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }
        List list = new LinkedList(set);
//        Collections.sort(list);         //set은 정렬 불가하기 때문에 list에 넣어서 정렬
        System.out.println(list);
    }
}
