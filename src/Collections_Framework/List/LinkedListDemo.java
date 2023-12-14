package Collections_Framework.List;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        /*
        * Java LinkedList class can contain duplicate elements.
        * ava LinkedList class maintains insertion order.
        * Java LinkedList class is non synchronized.
        * In Java LinkedList class, manipulation is fast because no shifting needs to occur.
        * Java LinkedList class can be used as a list, stack or queue.
        * */

        List<Integer> list = new LinkedList<>();

        for (int i= 1; i<=10; i++){
            list.add(i);
        }

        System.out.println("List : "+ list);
        list.add(2,100);
        System.out.println("List After add at 2nd Index: "+ list);
        list.set(3,200);
        System.out.println("List after replacing at 3rd index : "+ list);

//        List<Integer> list2 = new ArrayList<>(Arrays.asList(111,222,333,444,555));
//        List<Integer> list2 = new ArrayList<>(List.of(111,222,333,444,555));
        List<Integer> list2 = new ArrayList<>();
        list2.add(111);
        list2.add(222);
        list2.add(333);
        list2.add(444);

        System.out.println("List 2: "+ list2);

        list.addAll(4,list2);
        System.out.println("List Affter adding list : "+list);


        if (list.contains(222)){
            System.out.println("list1 has 222 value");
        }else{
            System.out.println("list1 does has 222 value");
        }

        System.out.println("List size : "+list.size());
        System.out.println("List element to get : "+list.get(6));
        System.out.println("Remove element : "+list.remove(1));


        List<String> arr1 = new LinkedList<>();
        arr1.add("20");
        arr1.add("dbg");
        arr1.add("wwd");
        arr1.add("50");
        arr1.add("rty");

        ListIterator<String> itr = arr1.listIterator();
        System.out.println("Traverse in forward direction");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        System.out.println("Traverse in backward direction");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }


    }
}
