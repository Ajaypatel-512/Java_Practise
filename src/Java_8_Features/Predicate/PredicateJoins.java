package Java_8_Features.Predicate;

import java.util.function.Predicate;

public class PredicateJoins {
    public static void main(String[] args) {
        int [] x = {0,10,20,30,40,50,60,70,7,73};

        Predicate<Integer> p1 = i -> (i>10);
        Predicate<Integer> p2 = i -> (i%2==0);
        System.out.println("Greater Than 10");
        method1(p1,x);

        System.out.println("Even Numbers");
        method1(p2,x);

        System.out.println("Odd Number :");
        method1(p2.negate(),x);

        System.out.println("Not greater than 10 :");
        method1(p1.negate(),x);

        System.out.println("Greater than 10 and also Even :");
        method1(p1.and(p2),x);

        System.out.println("Greater than 10 or also Even :");
        method1(p1.or(p2),x);

    }
    static void method1(Predicate<Integer> p, int [] x){
        for (int each: x){
            if (p.test(each)){
                System.out.println(each);
            }
        }
    }
}
