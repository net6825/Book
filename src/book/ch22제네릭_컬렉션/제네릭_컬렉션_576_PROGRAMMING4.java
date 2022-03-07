package book.ch22제네릭_컬렉션;

public class 제네릭_컬렉션_576_PROGRAMMING4 {
    public static <T> String a(T t){
        return t.getClass().getName();
    }

    public static void main(String[] args) {
        int i = 1;
        float f = 1;
        System.out.printf(a(i)+"\n"+a(f));
    }
}
