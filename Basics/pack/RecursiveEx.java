package com.expertzlab.Basics.pack;

/**
 * Created by agnel on 5/4/18.
 */
public class RecursiveEx {
    static int count =0;
    public static void p(){
        count++;
        if(count<=5) {
            System.out.println("Helo Recursive fun.");
            p();
        }
    }


    public static void main(String[] args) {

        p();
    }

}
