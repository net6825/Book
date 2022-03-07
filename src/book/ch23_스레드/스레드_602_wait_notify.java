package book.ch23_스레드;

class Buffer {
    private int data;
    private boolean empty = true;

    public synchronized int get() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = true;
        notifyAll();
        return data;
    }

    public synchronized void put(int data) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = false;
        this.data = data;
        notifyAll();
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
            System.out.println("생산자: " + i + "번 케익을 생산하였습니다");
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int data = buffer.get();
            System.out.println("소비자" + data + "번 케익을 소비하였습니다.");
            try {
                Thread.sleep((int) Math.random() * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class 스레드_602_wait_notify {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        (new Thread(new Producer(buffer))).start();
        (new Thread(new Consumer(buffer))).start();
    }
}
