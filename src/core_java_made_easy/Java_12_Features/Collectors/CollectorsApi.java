package core_java_made_easy.Java_12_Features.Collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsApi {
    public static void main(String[] args) {

        /**
         * It is a composite of two downstream collectors. Every element is processed by both downstream collectors.
         * Then their results are passed to the merge function and transformed into the final result.
         *
         */
        Result result = Stream.of(5, 10, 8, 20, 7).collect(
                Collectors.teeing(
                        Collectors.counting(),
                        Collectors.filtering(n -> Integer.parseInt(n.toString()) > 10, Collectors.toList()),
                        Result::new)
        );

        System.out.println(result);

    }
}
