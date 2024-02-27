package core_java_made_easy.Java_12_Features.String;

public class StringFeature {
    public static void main(String[] args) {
        String str = "  All the power is within you. You can do anything and everything";
        System.out.println("After indent: "+str.indent(5));
        System.out.println("Original String: "+str);
        System.out.println("Negative indent: "+str.indent(-2));
        System.out.println("Negative indent: "+str.indent(-4));

        String s1 = "10";
        Integer res = s1.transform(Integer::parseInt);
        System.out.println(res);
    }
}
