package com.enh.java.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class DateTimeEx1 {

    public static void main(String[] args) {
        //Date Format Conversion: Write a program that takes a date string in the format "MM/dd/yyyy" and converts it to "yyyy|MM|dd" format.
        System.out.println(
                LocalDate.parse("08/21/2023", DateTimeFormatter.ofPattern("MM/dd/yyyy"))
                        .format(DateTimeFormatter.ofPattern("yyyy|MM|dd"))
        );
        
        //Custom Date Format: Take a LocalDateTime object and formats it in a custom format like "dd MMM yyyy, HH:mm:ss".
        System.out.println(
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm:ss"))
//                localDateTime.format(DateTimeFormatter.ofPattern("dd MMM yyyy 'T' HH:mm:ss"))
//                localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        );

        //Relative Time Display: Take LocalDateTime and displays the time difference in a human-readable format, such as "2 hours ago" or "3 days from now".
        Duration dateTimeDiff = Duration.between(LocalDateTime.of(2023, 6, 18, 0, 30), LocalDateTime.now());
        
        long years = dateTimeDiff.toDays() / 365;
        long months = (dateTimeDiff.toDays() % 365) / 30;
        long days = (dateTimeDiff.toDays() % 365) % 30;
        long hours = (dateTimeDiff.toHours() % 24);
        long minutes = (dateTimeDiff.toMinutes() % 60);
        long seconds = (dateTimeDiff.toSeconds() % 60);

        System.out.println(dateTimeDiff.isNegative());
        
        if (dateTimeDiff.isNegative()) {
            System.out.println(String.format("%d years, %d months, %d days, %d hours, %d minutes, %d seconds ago", years, months, days, hours, minutes, seconds));
        } else if (dateTimeDiff.isZero()) {
            System.out.println("Now");
        } else {
            System.out.println(String.format("%d years, %d months, %d days, %d hours, %d minutes, %d seconds from now", years, months, days, hours, minutes, seconds));
        }
    }
}
