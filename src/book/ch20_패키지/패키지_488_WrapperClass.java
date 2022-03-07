package book.ch20_패키지;

public class 패키지_488_WrapperClass {
    public static void main(String[] args) {
        String s1 = Integer.toString(10);
        String s2 = Integer.toString(10000);
        String s3 = Float.toString((float) 3.14);
        String s4 = Double.toString(3.141592);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
