package com.expertzlab.RegularEx;

enum Day{sun,mon,tue,wed,thu,fri,sat};

public class EnumTest2 {
    public static void main(String[] args) {



        //Day day:Day.values();

        Day day = Day.sun;

        switch(day){
            case sun:
                System.out.println("IN Sunday");
                break;
            case mon:
                System.out.println("In Monday");
                break;
            case tue:
                System.out.println("In Tuesday");
                break;


        }

    }

}
