package StreamMethods;
//Intermediate methods
//Distinct()
//limit()
//map
//flatMap
//filter

//Terminal Methods
//count()
//forEach()
//min
//max
//forEach
//collect
//reduce


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        List<String> vehicle = Arrays.asList("bus","car","bus","train","car","ship");

        List<String> distinct = vehicle.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);

        vehicle.stream().distinct().forEach(n->System.out.print(n+" "));
        System.out.println();

        List<String> limit = vehicle.stream().limit(3).collect(Collectors.toList());
        System.out.println(limit);

        vehicle.stream().limit(2).forEach(n->System.out.print(n+" "));
        System.out.println();

        long count = vehicle.stream().distinct().count();
        System.out.println(count);


    }
}
