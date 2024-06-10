package cheatShett.date;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {
        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("1. Current Time: " + currentTime);

        // Specific time
        LocalTime specificTime = LocalTime.of(15, 30, 0); // 3:30 PM
        System.out.println("2. Specific Time: " + specificTime);

        // Add/subtract hours
        LocalTime newTime = specificTime.plusHours(2); // Add 2 hours
        System.out.println("3. New Time after adding 2 hours: " + newTime);

        // Compare two times
        boolean isBefore = specificTime.isBefore(currentTime);
        System.out.println("4. Is Specific Time before Current Time? " + isBefore);
    }

    /*
    1. Current Time: 15:20:18.606343900
    2. Specific Time: 15:30
    3. New Time after adding 2 hours: 17:30
    4. Is Specific Time before Current Time? false
     */
}
