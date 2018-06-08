package com.expertzlab.EnumExample;

import java.util.Scanner;

public class EnumTest2 {
    enum Day {sunday, monday, tuesday, wednesday, thursday, friday, saturday}

    public static void main(String[] args) {

        Day[] day = Day.values();

        for (Day days : day) {
            //System.out.println(days);

           //Day day = Day.monday;

            switch (days) {

                case sunday:
                    System.out.println("Sunday");
                    break;

                case monday:
                    System.out.println("Monday");
                    break;

                case tuesday:
                    System.out.println("Tuesday");
                    break;

                case wednesday:
                    System.out.println("Wednesday");
                    break;

                case thursday:
                    System.out.println("Thursday");

                case friday:
                    System.out.println("Friday");
                    break;

                case saturday:
                    System.out.println("Saturday");
                    break;

                default:
                    System.out.println("No day");
                    break;


            }

        }
    }
}