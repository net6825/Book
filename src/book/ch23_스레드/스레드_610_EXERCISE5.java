package book.ch23_스레드;

class MyJob implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("A");
            Thread.sleep(1000);
            System.out.println("B");
        } catch (InterruptedException e) {
            System.out.println("C");
            ;
        }
        System.out.println("D");
    }
}

public class 스레드_610_EXERCISE5 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyJob());
        t.start();
        t.interrupt();
    }
}
