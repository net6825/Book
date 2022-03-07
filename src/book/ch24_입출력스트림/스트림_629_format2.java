package book.ch24_입출력스트림;

public class 스트림_629_format2 {
    public static void main(String[] args) {
        int i = 8;
        double r = Math.log(i);
        Integer I = 8;

        System.out.format("log(" + "%d" + ")은 " + "%+020.8f" + "입니다.%n", i, r);
    }
}
