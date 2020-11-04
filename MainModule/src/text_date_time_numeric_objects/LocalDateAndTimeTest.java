package text_date_time_numeric_objects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import java.util.Optional;

public class LocalDateAndTimeTest {
    public LocalDateAndTimeTest() {
        System.out.println("Local Date and Time Test (immutable objects)");

        LocalDateTime localdatetime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localdatetime);
        LocalDate nowDate = LocalDate.now();
        System.out.println("LocalDate: " + nowDate);
        LocalTime NOWTIME = LocalTime.now();
        System.out.println("LocalTime: " + NOWTIME);

        System.out.println(LocalDate.of(2020, Month.FEBRUARY, 12));
        System.out.println(LocalTime.of(10,34));
        LocalDateTime otherDateTime = LocalDateTime.of(2020, 10, 16, 14, 43);

        LocalDateTime someDateTime = nowDate.atTime(NOWTIME);
        // System.out.println(someDateTime);

        LocalDate testDate = LocalDate.now();
        System.out.println(testDate + " replace day/month/year with ");
        // replace day/month/year with ...
        testDate = testDate.withDayOfMonth(1).withMonth(4).withYear(1999);

        System.out.println(testDate + " plus day/month/year: ");
        testDate = testDate.plusDays(3).plusMonths(2).plusYears(10);
        System.out.println(testDate);
        System.out.println("get only the year: " + testDate.getYear());
        System.out.println("LocalDate.of(2020, 5, 2).isBefore(LocalDate.now()): "
                + LocalDate.of(2020, 5, 2).isBefore(LocalDate.now()));


    }
}
