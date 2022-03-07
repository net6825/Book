package book.ch23_스레드;

class MyRuunable1 implements Runnable {
    String myName;

    public MyRuunable1(String name) {
        myName = name;
    }

    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(myName + i + " ");
        }
    }
}

public class 스레드_585_예제1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRuunable1("A"));
        Thread t2 = new Thread(new MyRuunable1("B"));
        t1.start();
        t2.start();
    }
}
