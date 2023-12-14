package Collections_Framework.Set;

import java.util.Set;
import java.util.TreeSet;

public class StringBufferTreeSetDemo {
    public static void main(String[] args) {
        Set<StringBuffer> set = new TreeSet<>();

        set.add(new StringBuffer("abc"));
        set.add(new StringBuffer("3bc"));
        set.add(new StringBuffer("5bc"));
        set.add(new StringBuffer("tbc"));
        set.add(new StringBuffer("wsytbc"));

        for (StringBuffer obj : set){
            System.out.println(obj);
        }
    }
}
