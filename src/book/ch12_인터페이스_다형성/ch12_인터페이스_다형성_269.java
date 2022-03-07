package book.ch12_인터페이스_다형성;

abstract class Shape0{       //추상클래스 생성(객체 생성 불가)
    int x,y;
    public void move(int x, int y){     //추상클래스라도 일반 메소드 가질 수 있음
        this.x = x;
        this.y = y;
    }
    public abstract void draw();        //추상 메소드 선언
};

class Rectangle0 extends Shape0{
    int width, height;
    public void draw(){
        System.out.println("사각형 그리기 메소드");
    }
};

class Circle0 extends Shape0{
    int radius;
    public void draw(){
        System.out.println("원 그리기 메소드");
    }
};

public class ch12_인터페이스_다형성_269 {
}