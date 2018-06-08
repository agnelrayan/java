package com.expertzlab.EnumExample;


public class Enum2 {
    enum Day {
        SUNDAY(5), MONDAY(10), TUESDAY(15), WEDNESDAY(25), THURSDAY(30), FRIDAY(35), SATURDAY(40);

        private int value;

        private Day(int value) {

            this.value = value;
        }
        }
    public static void main(String[] args) {

       // Day day;
        //for(Day day:Day.values())
         //  Day day = Day.MONDAY;
         //  Day day2 = Day.FRIDAY;
         //   System.out.println(day);
       // System.out.println(day2);

        for(Day day: Day.values())
            System.out.println("Value:"+day.value);


    }
}
