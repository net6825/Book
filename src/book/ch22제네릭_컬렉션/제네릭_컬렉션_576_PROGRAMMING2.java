package book.ch22제네릭_컬렉션;

class MyMath<T extends Number> {
    double d = 0.0;

    public double getAverage(T[] a) {
        for (int i = 0; i < a.length; i++) {
            d += a[i].doubleValue();
        }
            return d / a.length;
    }
}

public class 제네릭_컬렉션_576_PROGRAMMING2 {
    public static void main(String[] args) {
        Integer i[] = {1, 2, 3, 4, 5};
        Double d[] = {1.1, 2.2, 3.3, 4.4 ,5.5};
        MyMath<Integer> I = new MyMath<Integer>();
        System.out.println(I.getAverage(i));
        MyMath<Double> D = new MyMath<Double>();
        System.out.println(D.getAverage(d));
    }
}
