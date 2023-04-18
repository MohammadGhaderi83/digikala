package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDate {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd\nHH:mm:ss");
    LocalDateTime now = LocalDateTime.now();

    public LocalDateTime getNow() {
        return now;
    }
}
