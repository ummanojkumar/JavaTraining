package cheatShett.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class AllDates {


    public static void main(String[] args) {
        // 1. LocalDate - current date
        LocalDate today = LocalDate.now();
        System.out.println("1. LocalDate - current date: " + today); // Output: 2024-06-12 (example)

        // 2. LocalTime - current time
        LocalTime now = LocalTime.now();
        System.out.println("2. LocalTime - current time: " + now); // Output: 15:30:45.123 (example)

        // 3. LocalDateTime - current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("3. LocalDateTime - current date and time: " + currentDateTime); // Output: 2024-06-12T15:30:45.123 (example)

        // 4. ZonedDateTime - current date and time with timezone
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        System.out.println("4. ZonedDateTime - current date and time with timezone: " + currentZonedDateTime); // Output: 2024-06-12T15:30:45.123+01:00[Europe/Paris] (example)

        // 5. DateTimeFormatter - custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("5. DateTimeFormatter - custom format: " + formattedDateTime); // Output: 12/06/2024 15:30:45 (example)

        // 6. Parsing dates
        LocalDate parsedDate = LocalDate.parse("2024-06-12");
        System.out.println("6. Parsing dates: " + parsedDate); // Output: 2024-06-12

        // 7. Adding days to a date
        LocalDate addedDate = today.plusDays(5);
        System.out.println("7. Adding days to a date: " + addedDate); // Output: 2024-06-17

        // 8. Subtracting days from a date
        LocalDate subtractedDate = today.minusDays(5);
        System.out.println("8. Subtracting days from a date: " + subtractedDate); // Output: 2024-06-07

        // 9. Period between two dates
        LocalDate birthDate = LocalDate.of(1990, Month.JANUARY, 1);
        Period period = Period.between(birthDate, today);
        System.out.println("9. Period between two dates: " + period); // Output: P34Y5M11D (example)

        // 10. Duration between two times
        LocalTime time1 = LocalTime.of(10, 30);
        LocalTime time2 = LocalTime.of(12, 45);
        Duration duration = Duration.between(time1, time2);
        System.out.println("10. Duration between two times: " + duration); // Output: PT2H15M

        // 11. Finding the day of the week for a given date
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("11. Finding the day of the week for a given date: " + dayOfWeek); // Output: WEDNESDAY (example)

        // 12. Checking if a year is a leap year
        boolean isLeapYear = today.isLeapYear();
        System.out.println("12. Checking if a year is a leap year: " + isLeapYear); // Output: false

        // 13. Getting the number of days in a month
        int daysInMonth = today.lengthOfMonth();
        System.out.println("13. Getting the number of days in a month: " + daysInMonth); // Output: 30

        // 14. Calculating the next Tuesday from today
        LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("14. Calculating the next Tuesday from today: " + nextTuesday); // Output: 2024-06-18 (example)

        // 15. Formatting date using predefined format
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_DATE;
        String isoFormattedDate = today.format(isoFormatter);
        System.out.println("15. Formatting date using predefined format: " + isoFormattedDate); // Output: 2024-06-12

        // 16. Using Month enum
        Month currentMonth = today.getMonth();
        System.out.println("16. Using Month enum: " + currentMonth); // Output: JUNE

        // 17. Using YearMonth
        YearMonth yearMonth = YearMonth.now();
        System.out.println("17. Using YearMonth: " + yearMonth); // Output: 2024-06

        // 18. Using MonthDay
        MonthDay monthDay = MonthDay.now();
        System.out.println("18. Using MonthDay: " + monthDay); // Output: --06-12

        // 19. Getting current time in UTC
        Instant nowUtc = Instant.now();
        System.out.println("19. Getting current time in UTC: " + nowUtc); // Output: 2024-06-12T14:30:45.123Z (example)

        // 20. Converting Instant to LocalDateTime
        LocalDateTime localDateTimeFromInstant = LocalDateTime.ofInstant(nowUtc, ZoneId.systemDefault());
        System.out.println("20. Converting Instant to LocalDateTime: " + localDateTimeFromInstant); // Output: 2024-06-12T15:30:45.123 (example)
    }

    /*
    1. LocalDate - current date: 2024-06-12
    2. LocalTime - current time: 20:05:08.893839200
    3. LocalDateTime - current date and time: 2024-06-12T20:05:08.894837100
    4. ZonedDateTime - current date and time with timezone: 2024-06-12T20:05:08.894837100+05:30[Asia/Calcutta]
    5. DateTimeFormatter - custom format: 12/06/2024 20:05:08
    6. Parsing dates: 2024-06-12
    7. Adding days to a date: 2024-06-17
    8. Subtracting days from a date: 2024-06-07
    9. Period between two dates: P34Y5M11D
    10. Duration between two times: PT2H15M
    11. Finding the day of the week for a given date: WEDNESDAY
    12. Checking if a year is a leap year: true
    13. Getting the number of days in a month: 30
    14. Calculating the next Tuesday from today: 2024-06-18
    15. Formatting date using predefined format: 2024-06-12
    16. Using Month enum: JUNE
    17. Using YearMonth: 2024-06
    18. Using MonthDay: --06-12
    19. Getting current time in UTC: 2024-06-12T14:35:08.912838900Z
    20. Converting Instant to LocalDateTime: 2024-06-12T20:05:08.912838900
     */
}
