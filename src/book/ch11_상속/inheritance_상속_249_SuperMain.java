package book.ch11_상속;

public class inheritance_상속_249_SuperMain extends inheritance_상속_249_super {
    int data = 200;

    public void print() {
        super.print();
        System.out.println("서브 클래스의 print()메소드");
        System.out.println(this.data);
        System.out.println(super.data);
    }

    public static void main(String[] args) {
        inheritance_상속_249_SuperMain obj = new inheritance_상속_249_SuperMain();
//        obj.print();
    }
}