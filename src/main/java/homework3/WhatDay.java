package homework3;

public class WhatDay {
    public static void main(String[] args) {
        for (Weekday weekday : Weekday.values())
            System.out.println("Выходной? : " + weekday + " - " + weekday.isHoliday());
    }
}
