package book.ch11_상속;

class ch11_상속_259_LAB1 {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "( " + this.name + ", " + this.age + " )";
    }

    public ch11_상속_259_LAB1(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ch11_상속_259_LAB1 a = new ch11_상속_259_LAB1("춘향", 18);
        ch11_상속_259_LAB1 b = new ch11_상속_259_LAB1("몽룡", 21);
        ch11_상속_259_LAB1 c = new ch11_상속_259_LAB1("사또", 50);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

    }
}
