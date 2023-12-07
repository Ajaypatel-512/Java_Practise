package Java_18_Features.Internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetAdd {
    public static void main(String[] args) {
        try {
            InetAddress name = InetAddress.getByName("google.com");
            System.out.println(name.getHostName());
            System.out.println(name.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
