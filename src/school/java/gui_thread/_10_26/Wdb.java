package school.java.gui_thread._10_26;

class Buffer {
    int data;
    boolean empty = true;

    synchronized int get() {
        while(empty){
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
    synchronized void put(int data) {
        while(!empty){
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

class Produce implements Runnable{
    Buffer buffer;

    Produce(Buffer b){
        this.buffer=b;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
                buffer.put(i);
                System.out.println("생산자 " + i + "번 케익을 생산하였습니다.");
            try {
                Thread.sleep((int) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    private Buffer buffer;
    public Consumer(Buffer b){
        this.buffer = b;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int data = buffer.get();
            System.out.println("소비자 " + data + "번 케익을 소비하였습니다");
            try {
                Thread.sleep((int) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Wdb {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Thread a = new Thread(new Produce(buffer));
        Thread b = new Thread(new Consumer(buffer));

        a.start(); b.start();
    }
}
