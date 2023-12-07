package Java_18_Features.Switch;

public class SwitchExhaust {
    public static void main(String[] args) {
        Object obj = null;

        // if case is not matched with any case then default should be given other it will be exhaustive

        switch (obj){
            case String s -> System.out.println("String");
            case Integer i -> System.out.println("Integer");
            default -> System.out.println("null");
        }
    }
}
