package book.ch11_상속;

public class inheritance_상속_242_SupereClass {
    int speed;
    int gear;
    public String color;

    public void speedUp(int increment) {
        speed += increment;
    }

    public void speedDown(int decrement) {
        speed -= decrement;
    }
}