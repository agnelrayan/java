package com.expertzlab.Collections.HashcodeEqualsMethodEx;

/**
 * Created by agnel on 5/22/18.
 */
public class ThisEx {

    public void display(){
        System.out.println("From Display Method:"+ this);
        //is a reference variable that refers to the current objectis);


    }

    public static void main(String[] args) {

        ThisEx obj = new ThisEx();
        System.out.println("HashCode for Obj:"+obj);
        obj.display();

    }



}
