package Collections_Framework.ArraysUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] a = {40,20,22,13,4};

        System.out.println("Before sort");
        for (int eachElement: a){
            System.out.print(eachElement +" , ");
        }
        Arrays.sort(a);
        System.out.println("After sort");
        for (int eachElement: a){
            System.out.print(eachElement+" , ");
        }

        String[] b = {"A","V","C","R","T"};
        Arrays.sort(b);
        System.out.println("After sort");
        for (String eachElement: b){
            System.out.println(eachElement);
        }


        Arrays.sort(b,new MyComparator());
        System.out.println("After sort using comparator");
        for (String eachElement: b){
            System.out.println(eachElement);
        }

        List<String> list = Arrays.asList(b);
        b[1] = "Y";
//        list.add("o");
        System.out.println(list);


        String a1[] = {"A","B","C","D"};
        String a2[] = {"E","F","G","H"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(a1));
        list1.addAll(Arrays.asList(a2));
        Object[] a3 = list1.toArray();
        System.out.println(Arrays.toString(a3));


        Integer[] num =    {100,33,22,1313,4,6};
        System.out.println("Max num : "+Collections.max(Arrays.asList(num)));
        System.out.println("Min num : "+Collections.min(Arrays.asList(num)));

    }
}
