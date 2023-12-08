package Java_8_Features.FunctionalInterface;

@FunctionalInterface
public interface B extends A{
//    void myMethod1(); cannot do

    @Override
    void myMethod();
}
