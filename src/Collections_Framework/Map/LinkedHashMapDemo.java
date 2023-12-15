package Collections_Framework.Map;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("john", 70);
        map.put("tony", 99);
        map.put("steve", 100);
        map.put("robin", 55);

        Set<String> keySet = map.keySet();
        System.out.println("Keys :"+keySet);

        Collection<Integer> values = map.values();
        System.out.println("values : "+values);

        for (String key:keySet) {
            System.out.println("key : "+key + " value : "+map.get(key));
        }
    }
}
