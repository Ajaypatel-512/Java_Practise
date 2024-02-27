package core_java_made_easy.Java_13_14_Features.PatternMatching;

public class PatternMatchDemo {
    public static void main(String[] args) {
        Object obj = get();
        if (obj instanceof String str){
            System.out.println(str);
        }

    }
    public static Object get(){
        return "Pattern Matching in action";
    }
}
