package org.example.date_time;
import java.util.*;
public class CalendarExample1 {
    public static void main(String[] args) {
        // Calendar is an abstract class, so we need to use a concrete subclass
        Calendar calendar = Calendar.getInstance();

        // Print the current date and time
        System.out.println("Current date and time: " + calendar.getTime());
        System.out.println("timestamp : "+calendar.getTimeInMillis());
        System.out.println(calendar.getFirstDayOfWeek());
        System.out.println(calendar.getWeekYear());
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));

        calendar.set(2024, 2, 1); // Set to 1st April 2024
        System.out.println("last year date and time: " + calendar.getTime());

































        /*// Set a specific date (e.g., 1st April 2024)
        calendar.set(2024, java.util.Calendar.APRIL, 1, 0, 0, 0);
        System.out.println("Start Date: " + calendar.getTime());

        // Set another specific date (e.g., 31st March 2025)
        calendar.set(2025, java.util.Calendar.MARCH, 31, 23, 59, 59);
        System.out.println("End Date: " + calendar.getTime());

        // Add one month and subtract seven days from the current date
        calendar.add(java.util.Calendar.MONTH, 1);
        calendar.add(java.util.Calendar.DATE, -7);
        System.out.println("Future Date: " + calendar.getTime());*/
    }
}
