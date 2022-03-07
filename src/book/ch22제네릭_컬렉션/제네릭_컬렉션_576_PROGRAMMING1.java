package book.ch22제네릭_컬렉션;

import java.util.ArrayList;

public class 제네릭_컬렉션_576_PROGRAMMING1<T> {
    ArrayList<T> s = new ArrayList<T>();
    public void add(T item) {
        s.add(item);
    }
    public T select() {
        int r = (int) (Math.random()*s.size());
        return s.get(r);
    }
}
