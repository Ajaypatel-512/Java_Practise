package core_java_made_easy.Collections_Framework.ComparableAndComparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparableAndComparator implements Comparator<StringBuffer> {

    public static void main(String[] args) {

        /*
        * Java provides Comparable interface which should be implemented by any custom class if we want to use Arrays or Collections sorting methods.
        * The Comparable interface has compareTo(T obj) method which is used by sorting methods, you can check any Wrapper, String or Date class to confirm this.
        * We should override this method in such a way that it returns a negative integer, zero, or a positive integer if “this” object is less than, equal to,
        * or greater than the object passed as an argument.
        *
        * Comparator interface compare(Object o1, Object o2) method need to be implemented that takes two Object argument,
        * it should be implemented in such a way that it returns negative int if the first argument is less than the second one and returns zero
        *  if they are equal and positive int if the first argument is greater than the second one.
        * Comparable and Comparator interfaces use Generics for compile-time type checking, learn more about Java Generics.
        *
        *
        *
        * Comparable interface can be used to provide single way of sorting whereas Comparator interface is used to provide different ways of sorting.
        * For using Comparable, Class needs to implement it whereas for using Comparator we don’t need to make any change in the class.
        * Comparable interface is in java.lang package whereas Comparator interface is present in java.util package.
        * We don’t need to make any code changes at client side for using Comparable, Arrays.sort() or Collection.sort() methods automatically uses the compareTo() method of the class.
        * For Comparator, client needs to provide the Comparator class to use in compare() method.
        * */

        Set<StringBuffer> set = new TreeSet<>(new ComparableAndComparator());

        set.add(new StringBuffer("abcdfvdf"));
        set.add(new StringBuffer("3bc"));
        set.add(new StringBuffer("5bsdvcsdc"));
        set.add(new StringBuffer("tbc"));
        set.add(new StringBuffer("wsytbc"));

        for (StringBuffer obj : set){
            System.out.println(obj);
        }

    }


    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {

//        String s1 = o1.toString();
//        String s2 = o2.toString();
//
//        return s1.compareTo(s2);

        int l1 = o1.length();
        int l2 = o2.length();

        if (l1 < l2){
            return -1;
        }else if (l1>l2){
            return 1;
        }else{
            return o1.compareTo(o2);
        }
    }
}
