package book.ch12_인터페이스_다형성;

class OuterClass{
    private String secret = "Time is money";

    public OuterClass() {
        InnerClass obj = new InnerClass();
        obj.print();
    }

    private class InnerClass{
        public InnerClass() {
            System.out.println("내부 클래스 생성자");
        }
        public void print() {
            System.out.println(secret); //클래스의 private 변수인 secret을 자유롭게 사용할 수 있음
        }
    }
}

public class ch12_인터페이스_다형성_289_InnerClass {
    public static void main(String[]args){
        new OuterClass();
    }
}
