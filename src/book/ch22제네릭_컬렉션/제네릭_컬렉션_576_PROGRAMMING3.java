package book.ch22제네릭_컬렉션;

    class MyPair<T> {
        private T a, b;

        public T getA() {
            return a;
        }

        public void setA(T a) {
            this.a = a;
        }

        public T getB() {
            return b;
        }

        public void setB(T b) {
            this.b = b;
        }

        public MyPair(T a, T b) {
            this.a=a;
            this.b=b;
        }

        @Override
        public String toString() {
            return "MyPair{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }
public class 제네릭_컬렉션_576_PROGRAMMING3 {
    public static void main(String[] args) {
        MyPair<String> fruit = new MyPair<String>("사과", "포도");
        System.out.println(fruit);

    }

}
