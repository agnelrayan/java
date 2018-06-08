package com.expertzlab.sample3;

/**
 * Created by agnel on 5/14/18.
 */
public class WrapperEx {
    public static void main(String[] args) {
        int i=100;
        Integer i2 = new Integer(i);
        Integer i3 = new Integer(i);
        int i4=i3.intValue();

        int i5=200;
        Integer i6 = new Integer(i5);
        Integer i7 = i5;



        char ch ='a';
        Character ch2 = new Character(ch);
        Character ch3 = ch;
        char ch1 = ch3;


        System.out.println("I:"+i);
        System.out.println("I2:"+i2);
        System.out.println("I3:"+i3);
        System.out.println("I4:"+i4);

        System.out.println("CH:"+ch);
        System.out.println("CH2:"+ch2);
        System.out.println("CH3:"+ch3);
        System.out.println("CH1:"+ch1);


    }
}

