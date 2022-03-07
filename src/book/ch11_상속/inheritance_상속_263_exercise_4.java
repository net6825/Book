package book.ch11_상속;

class Animal {
    String name;

    public Animal() {
        name = "UNKNOWN";
        System.out.println("동물입니다" + name);
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("동물입니다:" + name);
    }
}

class Lion extends Animal {
    public Lion() {
        System.out.println("사자입니다");
    }

    public Lion(String name) {
        System.out.println("사자입니다");
    }
}

public class inheritance_상속_263_exercise_4 {
    public static void main(String[] args) {
        Lion lion = new Lion("Brave");
        Lion lion2 = new Lion();
    }
}

//매개변수 없는 superclass는 먼저 실행 됨
