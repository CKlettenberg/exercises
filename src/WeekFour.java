import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static com.sun.tools.javac.resources.CompilerProperties.Fragments.Local;
import static java.time.temporal.TemporalQueries.localTime;

public class WeekFour {
    public static void main(String[] args) {
        //date();
        //year();
        localTime();

    }

    public static void date() {
        Date currentDate = new Date();
        System.out.println(currentDate);
    }

    public static void year() {

        Date currentDate = new Date();

        int year = currentDate.getYear();
        System.out.println(year);
    }

    public static void localTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(localDateTime.format(formatter));

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime: " + zonedDateTime);




        int year = localDateTime.getYear();
        System.out.println("Year: " + year);

        int month = localDateTime.getMonthValue();
        System.out.println("Month: " + month);

        int day = localDateTime.getDayOfMonth();
        System.out.println("Day: " + day);

        int hour = localDateTime.getHour();
        System.out.println("Hour: " + hour);

        int minute = localDateTime.getMinute();
        System.out.println("Minute: " + minute);

        int second = localDateTime.getSecond();
        System.out.println("Second: " + second);

    }
}








