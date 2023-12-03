package Java_13_14_Features.ContentBlock;

public class StringContentBlock {
    public static void main(String[] args) {

        String str = "<html>\n"
                + "<body>\n"
                + "<b> Ajay Patel </b>\n"
                + "</body>\n"
                + "</html>\n";

        System.out.println(str);

        String res = """
                <html>
                <body>
                <b> Ajay Pate </b>
                </body>
                </html>
                """;
        System.out.println(res);

        String res1 = """
                {\
                "name": "Ajay",\
                "age": 22\
                }\
                """;
        System.out.println(res1); // align in single line


    }
}
