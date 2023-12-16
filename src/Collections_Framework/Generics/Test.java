package Collections_Framework.Generics;

public class Test {
    public static void main(String[] args) {
        MyGenericClass<String> s = new MyGenericClass<>("Ajay");
        s.displayObjectDetails();
        System.out.println(s.getObj());


        MyGenericClass<Integer> i = new MyGenericClass<>(123);
        i.displayObjectDetails();
        System.out.println(i.getObj());

        MyGenericClass<Double> d = new MyGenericClass<>(123.10);
        d.displayObjectDetails();
        System.out.println(d.getObj());

    }
}
