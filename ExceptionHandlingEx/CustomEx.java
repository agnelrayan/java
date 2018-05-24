package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by geo on 4/10/17.
 */

class Custom extends Exception{
    public Custom(String s){
      super(s);
    }

}


public class CustomEx  {
    public static void validate(int i) throws Custom{
        if(i<18)
            throw new Custom("Not Eligible to vote");
        else
        //throw new Custom("Not eligible to vote");
            System.out.println("Eligible to vote");
    }
    public static void main(String[] args) {

        try{
          validate(19);
        }
        catch(Exception e){
            System.out.println(e);
        }
        //validate(2);
    }
}
