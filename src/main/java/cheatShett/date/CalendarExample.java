package cheatShett.date;

import java.util.Calendar;

public class CalendarExample {

    public static void main(String[] args) {
        // Create Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Get current date and time
        System.out.println("1. Current Date and Time: " + calendar.getTime());

        // Get specific components of the date
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months start from 0
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("2. Year: " + year + ", Month: " + month + ", Day of Month: " + dayOfMonth);

        // Set specific date and time
        calendar.set(2022, Calendar.JUNE, 10, 15, 30, 0); // June 10, 2022, 3:30 PM
        System.out.println("3. Updated Date and Time: " + calendar.getTime());

        // Add/subtract time
        calendar.add(Calendar.DAY_OF_MONTH, 7); // Add 7 days
        System.out.println("4. Date after adding 7 days: " + calendar.getTime());

        // Compare two calendar instances
        Calendar otherCalendar = Calendar.getInstance();
        otherCalendar.set(2022, Calendar.JUNE, 17); // June 17, 2022
        boolean isEqual = calendar.equals(otherCalendar);
        System.out.println("5. Calendars are equal: " + isEqual);
    }
    /*
    1. Current Date and Time: Mon Jun 10 15:13:21 IST 2024
    2. Year: 2024, Month: 6, Day of Month: 10
    3. Updated Date and Time: Fri Jun 10 15:30:00 IST 2022
    4. Date after adding 7 days: Fri Jun 17 15:30:00 IST 2022
    5. Calendars are equal: false
     */

}
