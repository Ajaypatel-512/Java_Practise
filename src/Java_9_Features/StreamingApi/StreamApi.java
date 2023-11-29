package Java_9_Features.StreamingApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,40,7,18,23,30,null);

        /**
         * Java 8 feature
         * Throw null when encounter null value
        **/
//        System.out.println(list.stream().filter(x->x%5==0).collect(Collectors.toList()));

        /**
         * Java 9 feature
         * Doesn't Throw null when encounter null value
         **/
        System.out.println(list.stream().takeWhile(x->x%5==0).collect(Collectors.toList()));
        System.out.println(list.stream().dropWhile(x->x%5==0).collect(Collectors.toList()));
        System.out.println(list.stream().flatMap(x-> Stream.ofNullable(x)).collect(Collectors.toList()));

    }
}
