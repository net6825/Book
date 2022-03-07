package school.java.gui_thread._10_12_g_t;

// 1. thread 클래스를 상속받아 mythread클래스 생성 run 메소드 오버라이딩하여 수행할 일 정의
class MThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println((10-i)+"");
        }
    }
}

public class WebDB {
    public static void main(String[] args) {
        // 2. thread를 실행하기 위해 thread 객체를 생성하여 start 메소드 호출
        MThread mt = new MThread();
        MThread mt2 = new MThread();
        mt2.getPriority();
        mt.start();
        mt2.start();
    }

}
