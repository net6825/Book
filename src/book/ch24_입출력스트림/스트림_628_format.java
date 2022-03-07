package book.ch24_입출력스트림;

public class 스트림_628_format {
    public static void main(String[] args) {
        int i = 8;
        double r = Math.log(i);
        Integer I = 8;

        System.out.format("log(" + "%d" + ")은 " + "%f" + "입니다.%n", i, r);
    }
}
