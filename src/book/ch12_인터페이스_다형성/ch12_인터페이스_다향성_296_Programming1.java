package book.ch12_인터페이스_다형성;

interface Movable{
    void move(int dx, int dy);
}
class Shape2 implements Movable {
    int x, y;
    public void draw(){
        System.out.println("shape draw");
    }
    public void move(int dx, int dy){
        x= dx;
        y= dy;
    }
};
class Rectangle2 extends Shape2 {
    int width, height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public void draw() {
        System.out.println("Rectangle Draw");
    }
};
class Triangle2 extends Shape2{
    int base,height;

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw() {
        System.out.println("Triangle Draw");
    }
    @Override
    public void move(int dx, int dy){
        x=dx;
        y=dy;
    }
}
class Circle2 extends Shape2{
    int radius;
    public void draw() {
        System.out.println("Circle Draw");
    }
}

public class ch12_인터페이스_다향성_296_Programming1 {
    private static Movable arrayOfShapes1[];

    public static void main(String[] args){
        init();
        moveAll();
    }
    public static void init() {
        arrayOfShapes1 = new Shape2[3];
        arrayOfShapes1[0] = new Rectangle2();
        arrayOfShapes1[1] = new Circle2();
        arrayOfShapes1[2] = new Triangle2();
    }
    public static void moveAll(){
        for(int i=0; i<arrayOfShapes1.length; i++){
            arrayOfShapes1[i].move(10,10);
        }
    }
};

