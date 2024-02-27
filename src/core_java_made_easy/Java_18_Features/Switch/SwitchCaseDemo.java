package core_java_made_easy.Java_18_Features.Switch;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Object obj = null;

        //Label is dominated by a preceding case label 'CharSequence c'
        switch (obj){
            case CharSequence c -> System.out.println(c);
//            case String s -> System.out.println(s);
            default -> System.out.println("Nothing");
        }

    }
}
