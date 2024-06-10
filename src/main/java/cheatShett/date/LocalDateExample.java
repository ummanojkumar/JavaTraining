package cheatShett.date;

import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {
        // Current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("1. Current Date: " + currentDate);

        // Specific date
        LocalDate specificDate = LocalDate.of(2022, 6, 10); // June 10, 2022
        System.out.println("2. Specific Date: " + specificDate);

        // Add/subtract days
        LocalDate newDate = specificDate.plusDays(7); // Add 7 days
        System.out.println("3. New Date after adding 7 days: " + newDate);

        // Compare two dates
        boolean isAfter = specificDate.isAfter(currentDate);
        System.out.println("4. Is Specific Date after Current Date? " + isAfter);
    }

    /*

    1. Current Date: 2024-06-10
    2. Specific Date: 2022-06-10
    3. New Date after adding 7 days: 2022-06-17
    4. Is Specific Date after Current Date? false

     */

}
