package core_java_made_easy.Java_10_Features.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(15,17,20,39);
        List<Integer> newList = list.stream().filter(i -> i%3==0).collect(Collectors.toList());

        List<Integer> newList1 = list.stream().filter(i -> i%3==0).collect(Collectors.toUnmodifiableList());
//        newList1.add(21); // Error java.lang.UnsupportedOperationException

        /**
         *  List.copyOf(), Set.copyOf(), and Map.copyOf()
         *  Collectors.toUnmodifiableList(), toUnmodifiableSet(), and toUnmodifiableMap()
         * */

        var integerIds = List.of(11, 22, 33, 44, 55);
        try
        {
            // Get an unmodifiable list by use of copyOf()
            List<Integer> copyOfIds = List.copyOf(integerIds);
            // Try to add element in unmodifiable list
            copyOfIds.add(66);
        }
        catch(UnsupportedOperationException e)
        {
            System.out.println("Collection can't modify.");
        }
        try
        {
            // Get an unmodifiable list by use Collector
            List<Integer> listOfEvenNumbers = integerIds.stream()
                    .filter(i -> i % 2 == 0)
                    .collect(Collectors.toUnmodifiableList());
            listOfEvenNumbers.add(66);
        }
        catch(UnsupportedOperationException e)
        {
            System.out.println("Collection can't modify.");
        }


    }
}
