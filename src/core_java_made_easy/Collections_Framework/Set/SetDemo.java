package core_java_made_easy.Collections_Framework.Set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        /*
        * HashSet stores the elements by using a mechanism called hashing.
        * HashSet contains unique elements only.
        * HashSet allows null value.
        * HashSet class is non synchronized.
        * HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
        * HashSet is the best approach for search operations.
        * The initial default capacity of HashSet is 16, and the load factor is 0.75.
        * */

        Random obj = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<20; i++){
            int num = obj.nextInt(5);
            list.add(num);
        }
        System.out.println("List : "+list);


        Set<Integer> set = new HashSet<>(list);
        System.out.println("Set : "+set);




    }
}
