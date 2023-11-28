package Java_9_Features.VarArgs;

import java.util.Arrays;
import java.util.List;

public class VarArgs {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("abc","xyz");
        List<String> l2 = Arrays.asList("nyc","lon");
        VarArgs.myMethod(l1,l2);

        VarArgs varArgs = new VarArgs();
        varArgs.MyMeth(l1,l2);
    }

    @SafeVarargs // can also be used with private method as well
    public static void myMethod(List<String>... l){
//        Object [] obj = l;
//        obj[0] = Arrays.asList(1,2,3); // Class cast exception(heap pollution problem)

        String name = (String) l[0].get(0);
        System.out.println(name);
    }

    @SafeVarargs
    private void MyMeth(List<String>...l){
        System.out.println(Arrays.toString(l));
    }
}
