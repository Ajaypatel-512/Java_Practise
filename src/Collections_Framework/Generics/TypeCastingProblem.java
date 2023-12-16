package Collections_Framework.Generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {
    public static void main(String[] args) {
        String[] s = new String[10];
    s[0] = "john";
    s[1] = "tony";

        List l = new ArrayList();
        l.add("john");
        l.add(10);

        String name = (String) l.get(0);
        String age = (String) l.get(1); // classcast exception
    }

}
