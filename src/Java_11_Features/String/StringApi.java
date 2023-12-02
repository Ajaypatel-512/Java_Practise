package Java_11_Features.String;

import java.util.stream.Collectors;

public class StringApi {
    public static void main(String[] args) {

        /**
         *
         * New utility methods added to the String class, such as repeat(), isBlank(), strip(), lines().
         * */
        String str = " ";
        System.out.println(str.isBlank());

        str = "Hi \nHow are you";

        System.out.println(str.lines().collect(Collectors.toList()));

        System.out.println(str);
        char c = '\u2000';
        str = c+str;

        System.out.println(str);
        System.out.println(str.strip());
        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());
        System.out.println("-".repeat(10));

    }
}
