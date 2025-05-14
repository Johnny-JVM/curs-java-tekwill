package homework24;

import java.time.*;

public class TimeDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 2);
        LocalTime time = LocalTime.of(13, 20, 00);
        LocalDateTime ldt = LocalDateTime.of(2024,01, 2, 13, 20)
                .plusMinutes(1)
                .plusHours(1)
                .plusDays(1)
                .plusYears(1);
        ZoneId zone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime znd = ZonedDateTime.of(date, time, zone);

        System.out.println(date);
        System.out.println(znd);

    }
}
