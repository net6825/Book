package book.ch21예외처리;

public class 예외처리_534_PROGRAMMING4 {

    private int balance;

    public void depoist(int d) {
        balance += d;
    }

    public void withdraw(int w) {
        if (balance >= w) {
            balance -= w;
        } else if (balance < w) {
            throw new NegativeArraySizeException("잔고가 음수입니다");
        }
    }

    public static void main(String[] args) {
        예외처리_534_PROGRAMMING4 bank = new 예외처리_534_PROGRAMMING4();
//      Scanner sc = new Scanner(System.in);
        bank.depoist(1000);
        bank.withdraw(10000);
    }
}