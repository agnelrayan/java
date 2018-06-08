package com.expertzlab.EnumExample;

enum Day{sun,mon,tue,wed,thu,fri,sat};

public class EnumTest3 {

    Day day;

    public EnumTest3(Day day){
        this.day=day;
    }

    public void display(){

        switch(day){
            case sun:
                System.out.println("In Sunday");
                break;

            case mon:
                System.out.println("In Monday");
                break;

            case tue:
                System.out.println("In tuesday");
                break;

            default:
                System.out.println("Not in day");
                break;
        }

    }

    public static void main(String[] args) {
        EnumTest3 obj = new EnumTest3(Day.sun);
        obj.display();

    }
}
