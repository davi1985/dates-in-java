import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculateDateTime {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2024-09-30");
        LocalDateTime d02 = LocalDateTime.parse("2024-09-30T16:02:26");
        Instant d03 = Instant.parse("2024-09-30T16:02:26Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(3);

        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusHours(3);

        System.out.println(pastWeekLocalDateTime);
        System.out.println(nextWeekLocalDateTime);

        Instant pastWeekInstant = d03.minus(3, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(3, ChronoUnit.MINUTES);

        System.out.println(pastWeekInstant);
        System.out.println(nextWeekInstant);

//        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0, 0));
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
        Duration t3 = Duration.between(d03,pastWeekInstant);

        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
    }
}
