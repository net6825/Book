package book.ch22제네릭_컬렉션;

import java.util.PriorityQueue;

public class 컬렉션_562_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(30);
        pq.add(80);
        pq.add(20);

        for (Integer o : pq)
            System.out.println(o);
        System.out.println("원소 제거");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
