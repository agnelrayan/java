package com.expertzlab.ExceptionHandlingEx;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Parentex{
    void message() throws IOException {

        System.out.println("IN Parent Msg");
    }

}

public class ExceptOverrideEX extends Parentex {
    public void message(){
        System.out.println("In Child Message");
    }
    public static void main(String[] args) throws Exception{
        ExceptOverrideEX obj = new ExceptOverrideEX();

        obj.message();
    }
}
