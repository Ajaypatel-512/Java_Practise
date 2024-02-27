package core_java_made_easy.Java_8_Features.StreamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> even = list.stream().sorted().collect(Collectors.toList());
        System.out.println(even);

        List<Integer> odd = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(odd);
    }
}
