package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by agnel on 6/8/18.
 */
public class AgeValiate {
    public static void validate(int age) throws VoterAgeException {

        if(age<18)
            throw new VoterAgeException("You are not a valid Voter");
        else
            System.out.println("HI, You are eligible to Vote");


    }

    public static void main(String[] args) throws VoterAgeException {
        try {
            validate(16);
        }
        catch(Exception e){
            System.out.println(e);

        }
    }

}
