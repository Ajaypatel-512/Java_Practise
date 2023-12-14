package Collections_Framework.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet{
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("abc");
        set.add("3bc");
        set.add("5bc");
        set.add("tbc");
        set.add("wsytbc");

        for (String obj : set){
            System.out.println(obj);
        }
    }
}
