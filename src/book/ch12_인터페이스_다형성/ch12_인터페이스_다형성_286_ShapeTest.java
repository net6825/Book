package book.ch12_인터페이스_다형성;

class shape1 {
    protected int x, y;
    public void draw() {
        System.out.println("Shape Draw");
    }
}

class Rectangle extends shape1{
    private int width, height;
    public void draw(){
        System.out.println("Rectangle Draw");
    }
}

class Triangle extends shape1{
    private int base, height;
    public void draw(){
        System.out.println("Triangle Draw");
    }
}

class Circle extends shape1{
    private int radius;
    public void draw(){
        System.out.println("Circle Draw");
    }
}

public class ch12_인터페이스_다형성_286_ShapeTest {
    private static shape1 arrayOfShape[];
    public static void main(String []args){
        init();
        drawAll();
    }

    public static void init() {
        arrayOfShape = new shape1[3];
        arrayOfShape[0] = new Rectangle();
        arrayOfShape[1] = new Triangle();
        arrayOfShape[2] = new Circle();
    }
    public static void drawAll() {
        for (int i=0; i<arrayOfShape.length; i++){
            arrayOfShape[i].draw();
        }
    }
}
