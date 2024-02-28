package core_java_made_easy.Collections_Framework.Generics;

public class AnyRunnableTest {
    public static void main(String[] args) {
//        AnyRunnable<Thread> threadAnyRunnable = new AnyRunnable<>();
//        AnyRunnable<String> anyRunnable = new AnyRunnable<String>();  // error becuase string does not extends runnable

        AnyRunnable<MyClass> t = new AnyRunnable<>();

    }
}
