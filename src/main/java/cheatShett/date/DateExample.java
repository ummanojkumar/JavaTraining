package cheatShett.date;

import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
        // Current date and time
        Date currentDate = new Date();
        System.out.println("1. Current Date: " + currentDate);

        // Get time in milliseconds since January 1, 1970
        long milliseconds = currentDate.getTime();
        System.out.println("2. Milliseconds since January 1, 1970: " + milliseconds);

        // Set time in milliseconds since January 1, 1970
        Date newDate = new Date(1623326954000L);
        System.out.println("3. New Date: " + newDate);

        // Compare two dates
        boolean isEqual = currentDate.equals(newDate);
        System.out.println("4. Dates are equal: " + isEqual);
    }

    /*
    1. Current Date: Mon Jun 10 15:11:07 IST 2024
    2. Milliseconds since January 1, 1970: 1718012467044
    3. New Date: Thu Jun 10 17:39:14 IST 2021
    4. Dates are equal: false
     */
}
