package core_java_made_easy.Java_8_Features.StreamMethods;

//anyMatch
//allMatch
//noneMatch

//findFirst
//findAny

import java.util.*;

public class Match {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("one apple");
        fruits.add("one mango");
        fruits.add("two apple");
        fruits.add("more grapes");
        fruits.add("two guvas");

        boolean result = fruits.stream().anyMatch(value->{
            return value.startsWith("one");
        });
        System.out.println(result);


        boolean result2 = fruits.stream().allMatch(value->{
            return value.startsWith("one");
        });
        System.out.println(result2);


        boolean result3 = fruits.stream().noneMatch(value->{
            return value.startsWith("three");
        });
        System.out.println(result3);


        List<String> element = Arrays.asList("bus","car","bus","train","car","ship");
        Optional<String> ele = element.stream().findAny();
        System.out.println(ele.get());

        List<String> element1 = Arrays.asList("bus","car","bus","train","car","ship");
        Optional<String> ele1 = element1.stream().findFirst();
        System.out.println(ele1.get());

    }
}
