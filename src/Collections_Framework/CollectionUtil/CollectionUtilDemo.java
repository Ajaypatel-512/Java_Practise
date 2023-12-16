package Collections_Framework.CollectionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionUtilDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Z");
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("D");

        System.out.println("List : " +list);
        Collections.sort(list);
        System.out.println("ListAfter sorting : " +list);

        Collections.sort(list, new MyComparator());
        System.out.println("List After sorting : " +list);

        int res = Collections.binarySearch(list, "C");
        System.out.println("index of x : "+res);

        Collections.reverse(list);
        System.out.println(list);



    }
}
