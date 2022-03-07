package book.ch22제네릭_컬렉션;

interface Pair<K, V> {
    public K getKey();

    public V getValue();
}

public class 제네릭_538_다중타입매개변수<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    Pair<String, Integer> p1 = new 제네릭_538_다중타입매개변수<String, Integer>("Even", 8);
    Pair<String, String> p2 = new 제네릭_538_다중타입매개변수<String, String>("Hello", "world");

    public 제네릭_538_다중타입매개변수(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return null;
    }

    @Override
    public V getValue() {
        return null;
    }

}
