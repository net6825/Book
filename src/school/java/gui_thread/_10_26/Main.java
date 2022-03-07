package school.java.gui_thread._10_26;

class Counter{
    int value;
    void increment() { this.value++; }
    void decrement() { this.value--; }
    synchronized void print() { System.out.println(this.value); }
}

class MyThread extends Thread{
    Counter counter;

    public MyThread(Counter c){
        this.counter=c;
    }

    @Override
    public void run() {
        int i = 0;
        while(i<1000000){
            counter.increment();
            counter.decrement();
            if(i%100==0) counter.print();
        }
        try {
            sleep((int)(Math.random()*3));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i++;
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        MyThread t = new MyThread(c);
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        MyThread t3 = new MyThread(c);
        MyThread t4 = new MyThread(c);

        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
