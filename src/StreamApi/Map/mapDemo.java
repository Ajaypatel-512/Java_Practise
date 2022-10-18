package StreamApi.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class mapDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        arr.add(12);
        arr.add(34);
        arr.add(55);
        arr.add(22);
        arr.add(98);
        arr.add(1);
        System.out.println(arr);

        ans = (ArrayList<Integer>) arr.stream().map(n->n/10).collect(Collectors.toList());
        System.out.println(ans);


        List<String> vehicle = Arrays.asList("bus","train", "cycle","bike","ship");
        List<String> result = new ArrayList<>();

        result = vehicle.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(result);

        vehicle.stream().map(i->i.length()).forEach(len-> System.out.print(len+" "));

    }
}
