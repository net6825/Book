package book.ch11_상속;

class Dog extends inheritance_상속_249_Animal {
    //  메소드 재정의 하는 부분
    public void sound() {
        System.out.println("멍멍");
    }
}

public class ch11_상속_249_DogTest extends inheritance_상속_249_Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}