package Java_11_Features.Optional;

import java.util.Optional;

public class OptionalApi {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        Optional<String> optional2 = Optional.of("test");

        if (optional.isPresent()){}else{} // used before java 11
        if (optional2.isEmpty()){}else{}

    }
}
