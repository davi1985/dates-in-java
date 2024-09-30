import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstantiatingDates {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate date01 = LocalDate.now();
        LocalDateTime date02 = LocalDateTime.now();
        Instant date03 = Instant.now();

        LocalDate date04 = LocalDate.parse("2024-09-30");
        LocalDateTime date05 = LocalDateTime.parse("2024-09-30T14:00:00");
        Instant date06 = Instant.parse("2024-09-30T14:00:00Z");
        Instant date07 = Instant.parse("2024-09-30T14:00:00-03:00");

        LocalDate date08 = LocalDate.parse("30/09/2024", fmt1);
        LocalDateTime date09 = LocalDateTime.parse("30/09/2024 14:07", fmt2);
        LocalDate date10 = LocalDate.of(2024, 9, 30);
        LocalDateTime date11 = LocalDateTime.of(2024, 9, 30, 14, 10);

        System.out.println(date01);
        System.out.println(date02);
        System.out.println(date03);
        System.out.println(date04);

        System.out.println(date05);
        System.out.println(date06);
        System.out.println(date07);
        System.out.println(date08);
        System.out.println(date09);
        System.out.println(date10);
        System.out.println(date11);
    }
}
