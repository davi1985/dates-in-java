import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertingDateTimeGlobalToLocal {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2024-09-30");
        LocalDateTime d02 = LocalDateTime.parse("2024-09-30T16:02:26");
        Instant d03 = Instant.parse("2024-09-30T16:02:26Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println(d01.getDayOfMonth());
        System.out.println(d01.getMonthValue());
        System.out.println(d01.getYear());

        System.out.println(d02.getHour());
        System.out.println(d02.getMinute());
    }
}
