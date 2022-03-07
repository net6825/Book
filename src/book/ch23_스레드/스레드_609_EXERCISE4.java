package book.ch23_스레드;

class job extends Thread {
    byte n;

    public job(String name) {
        System.out.println(name + n++);
    }

    @Override
    public void run() {
        n = 0;
        while (true)
            System.out.println("" + n++);
    }

}

public class 스레드_609_EXERCISE4 {
    public static void main(String[] args) {
        Thread t = new Thread(new job("TTT"));
        Thread t1 = new Thread(new job("BBB"));
        t.start();
        t1.start();
    }
}
