package Java_8_Features.Predicate;

import java.util.function.Predicate;

public class GreaterThanTwenty {
    public static void main(String[] args) {

        Predicate<Integer> p = i -> (i<20);
        System.out.println(p.test(150));


    }
}
