package Collections_Framework.Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardParams {
    public static void main(String[] args) {
        WildCardParams wildCardParams = new WildCardParams();
//        wildCardParams.myMethod(new ArrayList<String>()); --> error not extends thread
        wildCardParams.myMethod(new ArrayList<MyClass>());
    }

//    List<?> ? --> wildcard character says any type can only add null
    public void myMethod(ArrayList<? extends Thread> l){
        l.add(null);
//        l.add("s"); error
    }
}
