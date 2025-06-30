package org.example.date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class JavaNewDateTimeLibraries {
    public static void main(String[] args) {
        // The new date and time API in Java 8 and later provides a more comprehensive and user-friendly
        // way to handle dates and times.
        // It includes classes like LocalDate, LocalTime, LocalDateTime, ZonedDateTime, etc.

        // Example of using LocalDate
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);
        String formatted = today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Today's date format: " + formatted);
        LocalDateTime localDateTime = today.atTime(0, 0,0); // Set time to 12:00 PM
        System.out.println("LocalDateTime from LocalDate: " + localDateTime);

        // Example of using LocalTime
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);
        String timeFormat = now.format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println("Current time format: " + timeFormat);

        System.out.println("time in nano: "+now.getNano());
        System.out.println("plus minutes: "+now.plusMinutes(30)); // Add 30 minutes to the current time

        // Example of using LocalDateTime
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);
        String dateTimeFormat = currentDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println("Current date and time format: " + dateTimeFormat);

        System.out.println("toEpochSecond : "+currentDateTime.toEpochSecond(ZoneOffset.UTC));
        System.out.println("toEpochMilli : "+currentDateTime.toInstant(ZoneOffset.UTC).toEpochMilli());
        System.out.println(currentDateTime.minusYears(1)); // Subtract one year from the current date and time
        System.out.println(currentDateTime.minusWeeks(1)); // Subtract one week from the current date and time


        // Example of using ZonedDateTime
        ZonedDateTime zonedNow = ZonedDateTime.now();
        System.out.println("Current date and time with timezone: " + zonedNow);

        ZonedDateTime newYorkDateTime = zonedNow.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Date and Time in New York: " + newYorkDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        ZoneId zoneId = ZoneId.of("Asia/Karachi");
        ZonedDateTime tokyoDateTime = zonedNow.withZoneSameInstant(zoneId);
        System.out.println("Date and Time in Karachi: " + tokyoDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        Period period = Period.between(today, today.plusDays(10));
        System.out.println("Period between today and 10 days later: " + period);

        Duration duration = Duration.between(LocalTime.of(12, 0), LocalTime.of(14, 30));
        System.out.println("Duration between 12:00 and 14:30: " + duration);
        // Example of using Instant
        Instant instantNow = Instant.now();
        System.out.println("Current instant: " + instantNow);

        MonthDay monthDay = MonthDay.of(Month.DECEMBER, 1);
        System.out.println("MonthDay for April 1st: " + monthDay);


    }
}
