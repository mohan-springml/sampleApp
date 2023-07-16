package com.example.dayidentifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@SpringBootApplication
public class DayIdentifierApplication {

    public static void main(String[] args) {
        SpringApplication.run(DayIdentifierApplication.class, args);
        LocalDate date = LocalDate.now();
        String dayIdentifier = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("Today is " + dayIdentifier);
    }
}
