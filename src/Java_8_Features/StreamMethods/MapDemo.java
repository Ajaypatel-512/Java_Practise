package Java_8_Features.StreamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Ajay");
        name.add("aman");
        name.add("rose");
        name.add("john");
        name.add("tony");

        List<String> list = name.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list);

    }
}
