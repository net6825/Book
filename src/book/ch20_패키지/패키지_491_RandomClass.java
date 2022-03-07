package book.ch20_패키지;

import java.util.Random;

public class 패키지_491_RandomClass {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(2));
        }
    }
}
