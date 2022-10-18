package StreamApi.Map;

import java.util.ArrayList;
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
    }
}
