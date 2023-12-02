package Java_11_Features.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileApi {
    public static void main(String[] args) throws IOException {
        Path test = Files.writeString(Files.createTempFile("test", ".txt"), "Java 11 is cool");
        System.out.println(test);

        String file = Files.readString(test);
        System.out.println(file);
    }
}
