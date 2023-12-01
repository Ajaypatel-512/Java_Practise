package Java_10_Features.Var;

import java.util.HashMap;
import java.util.Map;

public class VarDemo {
    public static void main(String[] args) {
        var x = 10;
        var y = "abc";
        var z = 3.0;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        var map = new HashMap<Integer,String>();

//        for (Map.Entry<Integer, String> entry:map.entrySet()){
//        }

        for (var entry:map.entrySet()){
            var value = entry.getValue();
        }

        /**
         * cannot assign null
         * working with lambda expression var doesn't work
         *  var x = (i) -> {System.out.println(i)};
         * */
    }
}
