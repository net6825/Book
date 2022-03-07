package book.ch22제네릭_컬렉션;

import java.util.HashSet;
import java.util.Set;

public class 컬렉션_559_중복검출 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        String[] sample = {"단어", "중복", "구절", "중복"};
        for (String a : sample)
            if (!s.add(a))
                System.out.println("중복된 단어 : " + a);

        System.out.println(s.size() + "중복되지 않은 단어: " + s);
    }
}
