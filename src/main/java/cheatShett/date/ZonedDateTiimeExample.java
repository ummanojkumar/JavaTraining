package cheatShett.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTiimeExample {


    public static void main(String[] args) {
        // Current date and time in default time zone
        ZonedDateTime currentDateTime = ZonedDateTime.now();
        System.out.println("1. Current Date and Time: " + currentDateTime);

        // Specific date and time in specific time zone
        ZonedDateTime specificDateTime = ZonedDateTime.of(2022, 6, 10, 15, 30, 0, 0, ZoneId.of("America/New_York")); // June 10, 2022, 3:30 PM in New York time zone
        System.out.println("2. Specific Date and Time: " + specificDateTime);

        // Add/subtract days
        ZonedDateTime newDateTime = specificDateTime.plusDays(7); // Add 7 days
        System.out.println("3. New Date and Time after adding 7 days: " + newDateTime);

        // Compare two date and time
        boolean isAfter = specificDateTime.isAfter(currentDateTime);
        System.out.println("4. Is Specific Date and Time after Current Date and Time? " + isAfter);
    }

    /*
    1. Current Date and Time: 2024-06-10T15:24:31.585900400+05:30[Asia/Calcutta]
    2. Specific Date and Time: 2022-06-10T15:30-04:00[America/New_York]
    3. New Date and Time after adding 7 days: 2022-06-17T15:30-04:00[America/New_York]
    4. Is Specific Date and Time after Current Date and Time? false
     */

}
