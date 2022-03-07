package book.ch11_상속;

class Circle {
    double radius;
    String color;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(String color, double radius) {
        super();
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

public class inheritacne_상속_264_Programming1 extends Circle {
    double height;

    public inheritacne_상속_264_Programming1() {
        super();
    }

    public inheritacne_상속_264_Programming1(double radius) {
        super.getRadius();
    }

    public inheritacne_상속_264_Programming1(double radius, double height) {
        super.getRadius();
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    static void main(String[] args) {
        inheritacne_상속_264_Programming1 obj1 = new inheritacne_상속_264_Programming1();
        System.out.println(obj1.getHeight());
        System.out.println(obj1.getVolume());
        inheritacne_상속_264_Programming1 obj2 = new inheritacne_상속_264_Programming1(5.0, 3.0);
        System.out.println(obj2.getHeight());
        System.out.println(obj2.getVolume());
    }
}
