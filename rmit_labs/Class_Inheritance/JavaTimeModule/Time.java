package Class_Inheritance.JavaTimeModule;

import java.time.*;
import java.time.format.*;;

public class Time {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);

        DateTimeFormatter formattedDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = myDateTime.format(formattedDateTime);
        System.out.println(formatted);
    }

}
