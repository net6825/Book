package 자바의정석;

import java.util.ArrayList;

class TV{}
class Audio {}

public class 제네릭2 {
    public static void main(String[] args) {
        ArrayList<TV> list = new ArrayList<TV>();   //TV타입의 객체만 저장 가능
        list.add(new TV());
//      list.add(new Audio());                      //TV타입이 아니라 에러 발생

    }
}
