import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertingDateHourToText {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2024-09-30");
        LocalDateTime d02 = LocalDateTime.parse("2024-09-30T14:17:22");
        Instant d3 = Instant.parse("2024-09-30T14:17:22Z");

        DateTimeFormatter formatter01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("D01 - " + d01.format(formatter01));
        System.out.println("D01 - " + formatter01.format(d01));
        System.out.println("D01 - " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        DateTimeFormatter formatter02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("D02 - " + d02.format(formatter01));
        System.out.println("D02 - " + d02.format(formatter02));
        System.out.println("D02 - " + formatter02.format(d02));
        System.out.println("D02 - " + d02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        DateTimeFormatter formatter03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                .withZone(ZoneId.systemDefault());

        System.out.println("D03 - " + formatter03.format(d3));

        DateTimeFormatter formatter04 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(d02.format(formatter04));

        DateTimeFormatter formatter05 = DateTimeFormatter.ISO_INSTANT;

        System.out.println(formatter05.format(d3));
    }
}
