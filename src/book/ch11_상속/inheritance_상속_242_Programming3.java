package book.ch11_상속;

class Shape3 {
    protected int x, y, w, h;

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}

class Triangle3 extends Shape3 {
    int a, b, c;

    public Triangle3(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return 2.0 * w * h;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle3{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}


public class inheritance_상속_242_Programming3 {
    public static void main(String[] args) {
        Triangle3 t = new Triangle3(3, 6, 9);
        System.out.println(t);
    }
}