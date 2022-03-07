package book.ch12_인터페이스_다형성;

abstract class Bird{
   abstract public void sound();
}

public class ch12_인터페이스_다향성_294_ex3 extends Bird{
        public void sound(){
            System.out.println("coo coo");
        };
}
