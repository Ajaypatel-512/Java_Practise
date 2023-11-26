package Java_9_Features.ImmutableCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestImmutable {

    public static void main(String[] args) {

        List<String> immutableListArray = List.of("abc", "xyz", "pqr");
//        immutableListArray.add("lmn"); //throws exception cannot modify list
//        List<String> immutableListArray2 = List.of("abc", "xyz", "pqr",null); // throws NullPointerException


        Set<String> immutableSetArray = Set.of("abc", "xyz", "pqr");
//        Set<String> immutableSetArray2 = Set.of("abc", "xyz", "xyz"); // throws exception IllegalArgException
//        Set<String> immutableSetArray3 = Set.of("abc", "xyz", null);  // throws NullPointerException


        Map<String, String> map = Map.of(
                "1", "a",
                "2", "b",
                "3", "c",
                "4", "G",
                "5", "e",
                "6", "e",
                "7", "k",
                "8", "s",
                "9", "f",
                "10", "o");
        map.forEach((K,V) -> System.out.println(K + " "+ V ));
        /**
         * If we try to add a key-value pair with a duplicate key, it’ll throw an IllegalArgumentException.
         * If we attempt to add a null key or value, it will throw a NullPointerException.
         * It hold upto 10 key-value pairs
         * **/


        Map<Integer, String> map2 = Map.ofEntries(
                Map.entry(101, "PP"),
                Map.entry(102, "QQ"),
                Map.entry(103, "RR")
        );
        map2.forEach((K,V) -> System.out.println(K + " "+ V ));


        /**
         * Map.ofEntries() method takes an unspecified number of Map.Entry<K, V> objects as arguments
         * If we try to add a key-value pair with a duplicate key, it throws an IllegalArgumentException.
         * A big advantage of the Map.ofEntries() method is that we can also use it to create a map from existing keys and values.
         * This isn’t possible with the Map.of() method because it only accepts undefined key-value pairs as arguments.
         */


    }

}
