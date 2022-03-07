package book.ch23_스레드;


import java.util.Date;

import static java.lang.Thread.sleep;

class Hello implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                Date date = new Date();
                System.out.println(date + " 안녕하세요?");
                sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Bye implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                Date date = new Date();
                System.out.println(date + " 안녕히 계세요.");
                sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class 스레드_611_PROGRAMMING2 {
    public static void main(String[] args) {
        Thread t = new Thread(new Hello());
        Thread t1 = new Thread(new Bye());
        t.start();
        t1.start();
    }
}
