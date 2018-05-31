package com.expertzlab.java8features;

/**
 * Created by agnel on 5/31/18.
 */
public class MAdd {
    public static void main(String[] args) {
        Addable ad1 =(a,b)->(a+b);
        System.out.println("Addition:"+ad1.add(10,20));

        Addable ad2=(a,b)->(a-b);
        System.out.println("Substraction:"+ad2.add(20,10));


        Addable ad3 = (a,b)->{
            return (a*b);
        };
        System.out.println("MUltiplication:"+ad3.add(10,10));
    }
}
