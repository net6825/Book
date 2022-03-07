package book.ch11_상속;

public class inheritance_상속_243_test {
    public static void main(String[] args) {
        inheritance_상속_242_상속SubClass c = new inheritance_상속_242_상속SubClass();  //서브클래스 객체 생성
        //슈퍼 클래스 필드와 메소드 사용
        c.color = "red";
        c.speedUp(100);
        c.speedDown(100);
        //자체 메소드 사용(서브 클래스)
        c.setTurbo(true);
    }
}