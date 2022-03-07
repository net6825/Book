package book.ch12_인터페이스_다형성;

public class ch12_인터페이스_다형성_272_Television implements ch12_인터페이스_다형성_272_RemoteController{
    public void turnOn(){
        System.out.println("TV 킴");
    }
    public void turnOff(){
        System.out.println("TV 끔");
    }

    static class ch12_인터페이스_다형성_272_Refrigerator implements ch12_인터페이스_다형성_272_RemoteController{
    public void turnOff() {
        System.out.println("냉장고 끔");
    }
    public void turnOn(){
        System.out.println("냉장고 킴");
    }
}
    public static void main(String []args){
        ch12_인터페이스_다형성_272_Television t = new ch12_인터페이스_다형성_272_Television();
        ch12_인터페이스_다형성_272_Refrigerator r = new ch12_인터페이스_다형성_272_Refrigerator();
        t.turnOff();
        t.turnOn();
        r.turnOff();
        r.turnOn();
    }
}