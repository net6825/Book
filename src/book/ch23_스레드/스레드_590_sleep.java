package book.ch23_스레드;

public class 스레드_590_sleep {
    public static void main(String[] args) throws InterruptedException {
        String message[] = {"Pride will have a fall.", "Power is dangerous unless you have humility."
                , "Office changes manners.", "Empty vessels make the most sound."};

        for (int i = 0; i < message.length; i++) {
            Thread.sleep(1000);
            System.out.println(message[i]);
        }
    }
}
