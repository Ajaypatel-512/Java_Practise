package core_java_made_easy.Java_8_Features.Predicate;

import java.util.function.Predicate;

public class LengthOfString {
    public static void main(String[] args) {
        Predicate<String> s = s1 -> (s1.length()>5);
        System.out.println(s.test("abc"));
        System.out.println(s.test("abcweffv"));

    }
}
