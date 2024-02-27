package core_java_made_easy.Java_8_Features.StreamMethods;

import java.util.Arrays;
import java.util.List;



public class toArray {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","A","B","5","6","7");

        Object arr[] = list.stream().toArray();
        System.out.println(arr.length);
    }
}
