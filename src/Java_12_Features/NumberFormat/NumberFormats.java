package Java_12_Features.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormats {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCompactNumberInstance();
        System.out.println(format.format(1000));
        format = NumberFormat.getCompactNumberInstance(Locale.US,NumberFormat.Style.LONG);
        System.out.println(format.format(1000));
        System.out.println(format.format(1000000));

    }
}
