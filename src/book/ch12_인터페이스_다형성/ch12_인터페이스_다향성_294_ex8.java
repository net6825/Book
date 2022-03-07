package book.ch12_인터페이스_다형성;
class Point2D {
    int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Point3D extends Point2D{
    int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
public class ch12_인터페이스_다향성_294_ex8 {
    public static void main(String[]args){
        Point2D p = new Point3D();
        System.out.println(p.x+""+p.y);
        p.setX(100);
        p.setY(40);
        System.out.println(p.x+""+p.y);
    }
}
