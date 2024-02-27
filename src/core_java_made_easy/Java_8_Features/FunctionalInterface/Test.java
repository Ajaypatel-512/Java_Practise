package core_java_made_easy.Java_8_Features.FunctionalInterface;

public class Test {
    public static void main(String[] args) {
        A a = new C();
        a.myMethod();

        A b = () -> {
            System.out.println("Inside MyMethod");
        };

        b.myMethod();

    }
}
