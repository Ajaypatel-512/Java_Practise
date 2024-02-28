package core_java_made_easy.Collections_Framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IdentityHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Integer id1 = new Integer(10);
        Integer id2 = new Integer(10); // key same it will overrirde
//        Integer id3 = new Integer(30);
        map.put(id1,"john");
        map.put(id2,"steve");

        System.out.println(map);


    }
}
