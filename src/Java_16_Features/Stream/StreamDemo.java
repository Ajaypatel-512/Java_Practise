package Java_16_Features.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123", "456", "789");
        List<Integer> collect = list.stream().map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> collect1 = list.stream().map(Integer::parseInt).toList();
//        Set<Integer> collect2 = list.stream().map(Integer::parseInt).toSet();

    }
}
