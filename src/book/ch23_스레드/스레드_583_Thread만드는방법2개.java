package book.ch23_스레드;

class MyRuunable implements Runnable {
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Runnable :" +
                    i + " ");
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("extends : " +
                    i + " ");
        }
    }
}

public class 스레드_583_Thread만드는방법2개 {
    public static void main(String[] args) {
        Thread extendsT = new MyThread();
        extendsT.start();

        Thread runnableT = new Thread(new MyRuunable());
        runnableT.start();
    }
}
