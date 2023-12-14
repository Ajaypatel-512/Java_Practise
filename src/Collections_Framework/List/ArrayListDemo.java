package Collections_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        /*
         * Java ArrayList class can contain duplicate elements.
         * Java ArrayList class maintains insertion order.
         * Java ArrayList class is non synchronized.
         * Java ArrayList allows random access because the array works on an index basis.
         * In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
         * We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases. For example:
         * ArrayList<int> al = ArrayList<int>(); // does not work
         * ArrayList<Integer> al = new ArrayList<Integer>(); // works fine
         * Java ArrayList gets initialized by the size. The size is dynamic in the array list, which varies according to the elements getting added or removed from the list.
         *
         * */

        ArrayList<Integer> arr = new ArrayList();
//        arr.add(new Integer(20));
        arr.add(10);
//        arr.add(10.45);
//        arr.add("hello");

        System.out.println(arr);

        /*
         * There are various ways to traverse the collection elements:
         *
         * By Iterator interface.
         * By for-each loop.
         * By ListIterator interface.
         * By for loop.
         * By forEach() method.
         * By forEachRemaining() method.
         *
         * */

        ArrayList<Integer> arr1 = new ArrayList();
        arr1.add(20);
        arr1.add(10);
        arr1.add(40);
        arr1.add(50);
        arr1.add(60);
//        arr.add(10.45);
//        arr.add("hello");

        Iterator<Integer> itr = arr1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }

//        System.out.println(arr);

    }
}
