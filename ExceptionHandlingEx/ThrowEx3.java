package com.expertzlab.ExceptionHandlingEx;
public class ThrowEx3 {
    public static void eligible(int age, int mark) {

        if (age < 12 && mark < 40)
            // if(stuage<12 && stuweight<40){
            throw new ArithmeticException("NOt valid to write exam");
        else {
            System.out.println("Eligible to write exam");
        }

    }

    public static void main(String[] args) {
        System.out.println("Are you eligible:");
        eligible(11,46);
    }
}
