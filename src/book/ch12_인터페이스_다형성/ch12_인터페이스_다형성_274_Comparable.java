package book.ch12_인터페이스_다형성;

public class ch12_인터페이스_다형성_274_Comparable implements Comparable{
    private double volume=0;
    public ch12_인터페이스_다형성_274_Comparable(double v) {
        volume = v;
    }
    public int compareTo(Object otherObject){
        ch12_인터페이스_다형성_274_Comparable other = (ch12_인터페이스_다형성_274_Comparable) otherObject;
        if(this.volume < other.volume) return -1;
        else if (this.volume > other.volume) return 1;
        else return 0;
    }
    public static void main(String[] args){
        ch12_인터페이스_다형성_274_Comparable a = new ch12_인터페이스_다형성_274_Comparable(100);
        ch12_인터페이스_다형성_274_Comparable b = new ch12_인터페이스_다형성_274_Comparable(85.0);
        if (a.compareTo(b) > 0)
            System.out.println("a가 b보다 크다");
        else
            System.out.println("b가 a보다 같거나 크다");
    }
}
