package book.ch20_패키지.PROGRAMMING1;

public class 패키지_502_PROGRAMMING1_1 {
    //메소드들과 변수 설정
    // value는 주사위 면
    // num은 주사위의 숫자
    private int value;
    private int num;

    public void Dice() {
        value = 1;
    }

    public int roll() {
        num = (int) (Math.random() * 6 + 1);
        return num;
    }

    public void setValue(int v) {
        value = v;
    }

    public int getValue() {
        value = this.value;
        return value;
    }

    public String toString() {
        return "현재 면은" + value + "숫자는" + num;
    }
}
