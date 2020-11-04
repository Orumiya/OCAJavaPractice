package text_date_time_numeric_objects;

import java.time.*;
import java.time.temporal.TemporalUnit;

public class InstantDurationPeriod {
    public InstantDurationPeriod() {
        System.out.println("Instant, Duration and Period: (immutable objects)");
        System.out.println("Duration: amount of time in nanoseconds (for system tasks)");
        System.out.println("Instant: timestamp (for system tasks)");
        System.out.println("Period: amounts of time in units (day, month etc) (for business logic)");
        LocalDate today = LocalDate.now();
        LocalDate christmas = LocalDate.of(2020, 12, 24);
        Instant timestamp = Instant.now();
        Period periodToChristmas = Period.between(today, christmas);
        System.out.println("until christmas: " + periodToChristmas);
        int nanosecondsFromLastSecond = timestamp.getNano();
        System.out.println("nanosecondsFromLastSecond: " + nanosecondsFromLastSecond);

        Duration twoHours = Duration.ofHours(2);
        System.out.println("duration of 2 hours: " + twoHours);
        long second = twoHours.minusMinutes(20).getSeconds();
        System.out.println(second);
        Instant timestamp2 = Instant.now();
        System.out.println("instant now: " + timestamp2);
        timestamp2 = timestamp2.plusMillis(2000);
        Instant timestamp3 = timestamp2.plus(Duration.ofHours(2));
        Instant timestamp4 = timestamp2.plus(Duration.ofMinutes(10));
        Instant timestamp5 = timestamp2.plus(Duration.ofDays(600));
        System.out.println(timestamp2 + ", " + timestamp3 + ", " + timestamp4 + ", " + timestamp5);
        timestamp3 = timestamp3.plusMillis(100000);
        timestamp3 = timestamp3.plusNanos(100000);
        timestamp3 = timestamp3.plusSeconds(100000);
        System.out.println("timestamp3: " + timestamp3);

        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(16,12);
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2020,12,12);

        Period periodBetween = Period.between(date1, date2);
        Period shortPeriod = Period.ofMonths(LocalDate.now().getMonth().getValue());
        System.out.println("periodBetween: " + periodBetween);
        System.out.println("shortPeriod: " + shortPeriod);






    }
}
