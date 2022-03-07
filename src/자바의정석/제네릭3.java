package 자바의정석;

import java.util.ArrayList;

class Product{}
class Tv extends Product{}
class Audio1 extends Product{}

public class 제네릭3 {
    public static void main(String[] args) {
        ArrayList<Product> productlist = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();

//        productlist.add(new Tv());
        productlist.add(new Audio1());

//        tvList.add(new Tv());

        printAll(productlist);
    }

    private static void printAll(ArrayList<Product> productlist) {
        for (Product p : productlist) {
            System.out.println(p);
        }
    }
}
