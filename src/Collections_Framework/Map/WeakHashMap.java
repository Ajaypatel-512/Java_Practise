package Collections_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class WeakHashMap {
    public static void main(String[] args) throws InterruptedException {
//        Map<User,String> map = new HashMap<>();
        Map<User,String> map = new java.util.WeakHashMap<>();

        User u = new User();
        map.put(u,"Tony");
        System.out.println(map);

        u = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println(map);

    }
}
