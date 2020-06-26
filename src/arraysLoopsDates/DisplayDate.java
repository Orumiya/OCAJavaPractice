package arraysLoopsDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
// import java.time.*; wildcard import!!!

public class DisplayDate {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        //import helyett fully qualified name:
        java.time.LocalDate anotherDate = LocalDate.of(2020, 3,11);
        System.out.println(myDate); //2020-06-25  Default Format, default timezone!!!!
        System.out.println(anotherDate);
        LocalDateTime dt = LocalDateTime.now();
        LocalTime time = LocalTime.now();
        System.out.println("dateTime: " + dt);
        System.out.println("Time: " + time);
        String formattedDt = dt.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("ISO DATE TIME: " + formattedDt);
        formattedDt = dt.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("ISO LOCAL DATE: " + formattedDt);
        JapaneseDate jp = JapaneseDate.from(myDate);
        System.out.println("japanese date: " + jp);

        myDate = myDate.minusMonths(2);
        myDate = myDate.plusDays(10);
        System.out.println("myDate after plusz-minus" + myDate);
        LocalDate newDate = LocalDate.parse("1999-02-03", DateTimeFormatter.ISO_DATE);
        System.out.println(newDate);

        LocalDateTime date2 = LocalDateTime.now();
        String sdate = date2.format(DateTimeFormatter.ISO_DATE_TIME);
        String fDate = date2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("medium formatted: " + fDate);

    }
}
