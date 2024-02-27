package core_java_made_easy.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5);
        List<Integer> ans = arr.stream().map(n->n+100).collect(Collectors.toList());
        System.out.println(ans);


        List<Integer> lst1 = Arrays.asList(1,2);
        List<Integer> lst2 = Arrays.asList(6,7);
        List<Integer> lst3 = Arrays.asList(8,9);

        List<List<Integer>> finalList = Arrays.asList(lst1,lst2,lst3);
        List<Integer> finalAns = finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());

        System.out.println(finalList);
        System.out.println(finalAns);


        List<Integer> finalAns1 = finalList.stream().flatMap(x->x.stream().map(n->n+100)).collect(Collectors.toList());
        System.out.println();
        System.out.println("flatMap AND Map");
        System.out.println(finalAns1);

    }
}
