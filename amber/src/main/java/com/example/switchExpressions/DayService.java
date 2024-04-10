package com.example.switchExpressions;

public class DayService {

    int getDayNumberOfLettersForWorkday(Day day) {
        // TODO: implement here
        // return number of letters for working days or throw exception for the other



        return switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY -> day.name().length();
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
    }
}
