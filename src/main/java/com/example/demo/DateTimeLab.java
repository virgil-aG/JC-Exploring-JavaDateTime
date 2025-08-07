package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;

import static java.lang.System.out;

public class DateTimeLab {
    static public void main(String[] ars){
        //Exercise 1: LocalDate and DateTimeFormatter
        out.println("--- Exercise 1 ---");
        out.println("Prediction: The result of this code is '2025-8-21', '21/08/2025', and 'August 21, 2025'.");

        LocalDate today = LocalDate.of(2025, 8, 21);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        out.println("Default format: " + today);
        out.println("Custom format 1: " + today.format(dtf1));
        out.println("Custom format 2: " + today.format(dtf2));

        out.println("Observation: The output is '2025-08-21', '21/08/2025', and 'Thursday, August 21, 2025'.\n");

        //Exercise 2: LocalTime and DateTimeFormatter
        out.println("--- Exercise 2 ---");
        out.println("Prediction: The result of this code will be '16:45:30', '16:45:30' and '4:45:30 PM'.");

        LocalTime now = LocalTime.of(16,45,30);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        out.println("Default format: " + now);
        out.println("24-hour format: " + now.format(dtf3));
        out.println("12-hour format with AM/PM: " + now.format(dtf4));

        out.println("Observation: The output is '16:45:30', '16:45:30' and '4:45:30 PM'.\n");

        //Exercise 3: LocalDateTime and DateTimeFormatter
        out.println("--- Exercise 3 ---");
        out.println("Prediction: The result of this code is '2025-11-27T19:00:00', and 'Nov 27, 2025 at 7:00 PM'.");

        LocalDateTime event = LocalDateTime.of(2025,11,27,19,0,0);

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");

        out.println("Default format: " + event);
        out.println("Custom format: " + event.format(dtf5));

        out.println("Observation: The output is '2025-11-27T19:00', and 'Nov 27, 2025 at 07:00 PM'\n");

        //Exercise 4: Immutability of Date-Time Objects
        out.println("--- Exercise 4 ---");
        out.println("Prediction: The result of this code is '2025-09-01', '2025-09-01', and '2025-09-11'.");

        LocalDate startDate = LocalDate.of(2025, 9, 1);

        startDate.plusDays(10);

        out.println("Start date after trying to modify it: " + startDate);

        LocalDate endDate = startDate.plusDays(10);

        out.println("The original start date is still: " + startDate);
        out.println("The new end date is: " + endDate);

        out.println("Observation: The output is '2025-09-01', '2025-09-01', '2025-09-11'.\n");

        //Exercise 5: Adding and Subtracting Time
        out.println("--- Exercise 5 ---");
        out.println("Prediction: The result of this code will be '2025-10-15 10:30', '2026-12-15 15:30', and '2025-09-21 10:30'");

        LocalDateTime baseTime = LocalDateTime.of(2025, 10, 15, 10, 30 ,0);

        LocalDateTime futureTime = baseTime.plusYears(1).plusMonths(2).plusHours(5);;
        LocalDateTime pastTime = baseTime.minusWeeks(3).minusDays(3);

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");;

        out.println("Base time:   " + baseTime.format(dtf6));
        out.println("Future time:   " + futureTime.format(dtf6));
        out.println("Past time:   " + pastTime.format(dtf6));

        out.println("Observation: The output is '2025-10-15 10:30','2026-12-15 15:30', and '2025-09-21 10:30'.\n");

        //Exercise 6: Period
        out.println("--- Exercise 6 ---");
        out.println("Prediction: The result of this code will be \"2 years, 4 months, and 5 days\".");

        LocalDate date1 = LocalDate.of(2024, 3, 15);
        LocalDate date2 = LocalDate.of(2026, 7, 20);

        Period period = Period.between(date1,date2);

        out.print("The period between the two dates is: ");
        out.print(period.getYears() + " years, ");
        out.print(period.getMonths() + " months, and ");
        out.println(period.getDays() + " days.");

        out.println("Observation: The output is \"2 years, 4 months, and 5 days\".\n");
    }
}
