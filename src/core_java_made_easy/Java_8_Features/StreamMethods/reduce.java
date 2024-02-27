package core_java_made_easy.Java_8_Features.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduce {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","A","B","5","6","7");

        Optional<String> reduce = list.stream().reduce((value, combinedValue)->{
            return combinedValue+value;
        });
        System.out.println(reduce.get());
    }
}
