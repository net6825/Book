package book.ch22제네릭_컬렉션;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 컬렉션_571_BinarySearch {
    public static void main(String[] args) {
        int key = 50;
        List<Integer> list = new ArrayList<Integer>();
        for(int i =-0; i<100; i++)
            list.add(i);
        int index = Collections.binarySearch(list,key); //이진 탐색으로 list에서 key의 값을 반환
        System.out.println("탐색 반환" +index);
    }
}
