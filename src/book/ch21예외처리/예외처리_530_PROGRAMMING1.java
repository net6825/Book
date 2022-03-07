package book.ch21예외처리;

// PROGRAMMING 1-2번
//public class PROGRAMMING1 {
//    public static void main(String[] args) {
//        sub();
//    }
//    public static void sub(){
//            int[] array = new int[10];
//        try {
//            int i = array[10];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
//    }
//}

// PROGRAMMING 1-3번
public class 예외처리_530_PROGRAMMING1 {
    public static void main(String[] args) {
        sub();
    }

    public static void sub() throws ArrayIndexOutOfBoundsException {
        int[] array = new int[10];
        int i = array[10];
    }
}