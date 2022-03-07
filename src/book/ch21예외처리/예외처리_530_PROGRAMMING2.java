package book.ch21예외처리;

class MyException1 extends NegativeArraySizeException {
    public MyException1(String message) {
        super(message);
    }
}

public class 예외처리_530_PROGRAMMING2 {
    public static void chekcNegatvie(int number) throws MyException1 {
        if (number < 0) {
            throw (new MyException1("음수는 안됩니다."));
        }
        System.out.println("다행히 음수가 아니군요");
    }

    public static void main(String[] args) {
        try {
            chekcNegatvie(1);
            chekcNegatvie(-1);
        } catch (MyException1 ex) {
            ex.printStackTrace();
        }
    }
}
