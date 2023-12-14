package Collections_Framework.Set;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HashSetDemo {
    public static void main(String[] args) {
        Random obj = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<20; i++){
            int num = obj.nextInt(5);
            list.add(num);
        }
        System.out.println("List : "+list);

    }
}
