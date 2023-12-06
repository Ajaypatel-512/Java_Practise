package Java_16_Features.DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
//        LocalTime time = LocalTime.parse("17:30:09.123456");
//        LocalTime time = LocalTime.parse("19:30:09.123456");
        LocalTime time = LocalTime.parse("11:30:09.123456");
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("h B");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hms B");
        System.out.println(time.format(timeFormatter));
    }
}
