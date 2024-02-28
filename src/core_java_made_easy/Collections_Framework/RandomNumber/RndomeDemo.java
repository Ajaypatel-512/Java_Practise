package core_java_made_easy.Collections_Framework.RandomNumber;

import java.util.Random;

public class RndomeDemo {
    public static void main(String[] args) {
        Random obj = new Random();
        int x = obj.nextInt();
        System.out.println("x : "+x);

        int y = obj.nextInt(100);
        System.out.println("Number bound underr 100 : "+ y);
    }
}
