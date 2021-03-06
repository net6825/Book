package book.ch23_스레드;

class Counter {
    private int value = 0;

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void printCounter() {
        System.out.println(value);
    }
}

class MyThread2 extends Thread {
    Counter sharedCounter;

    public MyThread2(Counter c) {
        this.sharedCounter = c;
    }

    public void run() {
        int i = 0;
        while (i < 20000) {
            sharedCounter.increment();
            sharedCounter.decrement();
            if (i % 40 == 0)
                sharedCounter.printCounter();
            try {
                sleep((int) (Math.random() * 2));
            } catch (InterruptedException e) {
            }
            i++;
        }
    }
}

public class 스레드_596_동기화 {
    public static void main(String[] args) {
        Counter c = new Counter();
        new MyThread2(c).start();
        new MyThread2(c).start();
        new MyThread2(c).start();
        new MyThread2(c).start();
    }
}
