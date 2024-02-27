package core_java_made_easy.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapDemo {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("steve", "warner", "finch");
        List<String> teamB = Arrays.asList("virat", "bumrah", "rohit");
        List<String> teamC = Arrays.asList("root", "butler", "peterson");

        List<List<String>> finalColl =  new ArrayList<>();
        finalColl.add(teamA);
        finalColl.add(teamB);
        finalColl.add(teamC);

//        Before Java 8
//        for (List<String> team:finalColl) {
//            for (String name:team) {
//                System.out.print(name+" ");
//            }
//        }

//        Using Stream Concept
        List<String> name =finalColl.stream().flatMap(n->n.stream()).collect(Collectors.toList());
        System.out.println(name);

    }
}
