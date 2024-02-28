package core_java_made_easy.Collections_Framework.Set;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Random obj = new Random();
        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for (int i=1; i<20; i++){
            int num = obj.nextInt(5);
            list.add(num);
        }
        System.out.println("List : "+list);


        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        System.out.println("LinkedHashSet : "+set);
    }
}
