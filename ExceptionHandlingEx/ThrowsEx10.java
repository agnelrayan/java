package com.expertzlab.ExceptionHandlingEx;

import java.io.IOException;

class ThrowsExample2 {
    void myMethod(int num)throws IOException, ClassNotFoundException{
        if(num==1)
            throw new IOException("IOException Occurred");
        else
            throw new ClassNotFoundException("ClassNotFoundException");
    }
}

public class ThrowsEx10{
    public static void main(String args[]){
        try{
            ThrowsExample2 obj=new ThrowsExample2();
            obj.myMethod(1);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}