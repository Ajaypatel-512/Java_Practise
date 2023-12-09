package Java_8_Features.NullCheck;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println("Is Present: "+empty.isPresent());

        Optional<String> data = Optional.of("data contains");
        System.out.println("Is Present: "+data.isPresent());
    }
}
