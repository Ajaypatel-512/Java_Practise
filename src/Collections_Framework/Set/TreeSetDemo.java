package Collections_Framework.Set;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Random obj = new Random();
        TreeSet<Integer> list = new TreeSet<>();
        for (int i=1; i<20; i++){
            int num = obj.nextInt(5);
            list.add(num);
        }
        System.out.println("List : "+list);


        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.println("TreeSet : "+set);
    }
}
