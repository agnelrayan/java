package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by geo on 4/10/17.
 */
public class FinallyEx {
    public static void main(String[] args) {
        try{
            int a[]={1,2,3};
            a[2]=30;
            System.out.println(a[6]);
        }

        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("In Finally Block");
        }
        System.out.println("Allow me to Continue");
}
}
