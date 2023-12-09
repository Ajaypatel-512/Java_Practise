package Java_8_Features.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> even = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even);

        long evenCount = list.stream().filter(n->n%2==0).count();
        System.out.println(evenCount);

        Optional<Integer> min = list.stream().min((val1, val2)->{
            return val1.compareTo(val2);
        });
        System.out.println(min.get());

        Optional<Integer> max = list.stream().max((val1, val2)->{
            return val1.compareTo(val2);
        });
        System.out.println(max.get());
    }
}
