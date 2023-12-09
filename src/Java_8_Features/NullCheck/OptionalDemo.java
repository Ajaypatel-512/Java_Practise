package Java_8_Features.NullCheck;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println("Is Present: "+empty.isPresent());
        if (empty.isPresent())  { System.out.println("value: "+empty.get());}


        Optional<String> data = Optional.of("data contains");
        System.out.println("Is Present: "+data.isPresent());
        System.out.println("value: "+data.get());

        System.out.println(data.filter(s->s.equals("data contains")));
        System.out.println(data.filter(s->s.equals("data contai")));

        System.out.println(data.orElse("default value"));
        data.ifPresent(System.out::println);
    }
}
