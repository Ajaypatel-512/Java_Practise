package core_java_made_easy.Collections_Framework.Set;

import java.util.Random;
import java.util.TreeSet;

public class NavigableTreeSetDemo {
    public static void main(String[] args) {
        Random obj = new Random();
        TreeSet<Integer> list = new TreeSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
//        for (int i=1; i<20; i++){
//            int num = obj.nextInt(5);
//            list.add(num);
//        }
        System.out.println("List : "+list);

        System.out.println(list.ceiling(20)); // lowest number greater than or equal to 20
        System.out.println(list.floor(10));  //  hihest number less than or equal to 10
        System.out.println(list.higher(20)); // lowest element which is greater than  20
        System.out.println(list.lower(20)); //  hihest element which is less than  20
        System.out.println(list.pollFirst()); // retrieve and remove first
        System.out.println(list.pollLast()); // retrieve and remove last first
        System.out.println(list.descendingSet()); // sort(desc)

    }
}
