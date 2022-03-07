package book.ch12_인터페이스_다형성;

interface Comparable1{
    int compareTo(Object other);
}
class Person3 implements Comparable1 {
    String name;
    double height;

    @Override
    public String toString() {
        return name + " / " + height;
    }

    public Person3(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public int compareTo(Object other) {
        if (this.height > ((Person3) other).height)
            return 1;
        else if (this.height == ((Person3) other).height)
            return 0;
        else
            return -1;
    }
}

public class ch12_인터페이스_다향성_296_Programming4 {
    public static Person3 getMaximum(Person3[] array) {
        Person3 max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].height > max.height)
                max = array[i];
        }
        return max;
    }
    public static void main(String []args){
        Person3[] array;
        array = new Person3[3];
        array[0] = new Person3("홍길동1",190.1);
        array[1] = new Person3("홍길동1",222.1);
        array[2] = new Person3("홍길동2",170.1);
        System.out.println(getMaximum(array));
    }
}