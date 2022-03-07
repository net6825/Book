package book.ch11_상속;

class Food {
    private int cal;
    private int price;
    private int weight;

    public Food(int cal, int price, int weight) {
        this.cal = cal;
        this.price = price;
        this.weight = weight;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return cal + "/" + price + "/" + weight;
    }
}

class Melon extends Food {
    private String farm;

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    public Melon(int cal, int price, int weight, String farm) {
        super(cal, price, weight);
        this.farm = farm;
    }

    @Override
    public String toString() {
        return super.toString() + "/" + farm;
    }
}

public class inheritance_상속_242_Programming5 {
    public static void main(String[] args) {
        Melon a = new Melon(1, 2, 3, "a");
        Melon b = new Melon(4, 5, 6, "b");
        System.out.println(a);
        System.out.println(b);
        a.setCal(100);
        b.setFarm("ccc");
        System.out.println(a);
        System.out.println(b);
    }
}
