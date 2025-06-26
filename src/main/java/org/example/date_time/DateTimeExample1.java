package org.example.date_time;

import java.util.Date;
import java.util.Scanner;

public class DateTimeExample1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date and time: " + date);
        // timestamp : 1971-01-01 00:00:00 UTC
        System.out.println("Current time in milliseconds since epoch: " + date.getTime());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        // Bank Transaction : 01-April-2024 00:00:00 to 31-March-2025 23:59:59
        Date startDate = new Date();
        System.out.println("startDate "+startDate);
        startDate.setYear(124); // 2024 - 1900
        startDate.setMonth(3); // April (0-based index)
        startDate.setDate(1); // 1st day of the month
        startDate.setHours(0); // Midnight
        startDate.setMinutes(0); // 0 minutes
        startDate.setSeconds(0);
        System.out.println("startDate modified "+startDate);
        Date endDate = new Date();
        System.out.println("endDate "+endDate);
        endDate.setYear(125); // 2025 - 1900
        endDate.setMonth(2); // April (0-based index)
        endDate.setDate(31); // 1st day of the month
        endDate.setHours(23); // Midnight
        endDate.setMinutes(59); // 0 minutes
        endDate.setSeconds(59);
        System.out.println("endDate modified "+endDate);
        Date futureDate = new Date();
        futureDate.setMonth(futureDate.getMonth() + 1);
        futureDate.setDate(futureDate.getDate() - 7);
        System.out.println("futureDate "+futureDate);
    }
}
