package book.ch12_인터페이스_다형성;

interface Controllable{
    void play();
    void stop();
}

public class ch12_인터페이스_다향성_296_Programming3  {
    public static void main(String[]args){
        Controllable controller = new Controllable() {
            @Override
            public void play() {
                System.out.println("play");
            }

            @Override
            public void stop() {
                System.out.println("stop");
            }
        };
        controller.play();
        controller.stop();
    }
}
