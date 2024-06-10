package cheatShett.date;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        // Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("1. Current Date and Time: " + currentDateTime);

        // Specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2022, 6, 10, 15, 30, 0); // June 10, 2022, 3:30 PM
        System.out.println("2. Specific Date and Time: " + specificDateTime);

        // Add/subtract days
        LocalDateTime newDateTime = specificDateTime.plusDays(7); // Add 7 days
        System.out.println("3. New Date and Time after adding 7 days: " + newDateTime);

        // Compare two date and time
        boolean isAfter = specificDateTime.isAfter(currentDateTime);
        System.out.println("4. Is Specific Date and Time after Current Date and Time? " + isAfter);
    }
    /*
    1. Current Date and Time: 2024-06-10T15:21:34.030120500
    2. Specific Date and Time: 2022-06-10T15:30
    3. New Date and Time after adding 7 days: 2022-06-17T15:30
    4. Is Specific Date and Time after Current Date and Time? false
     */

}
