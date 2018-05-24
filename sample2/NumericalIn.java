package com.expertzlab.sample2;

import java.util.Scanner;

/**
 * Created by agnel on 5/8/18.
 */
public class NumericalIn {
    public static void main(String[] args) {
        byte bByte;
        short sShort;
        int iInt;
        float fFloat;
        double dDouble;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the byte:");
        bByte=sc.nextByte();

        System.out.println("Enter the Short value:");
        sShort=sc.nextShort();

        System.out.println("Enter the Integer value:");
        iInt=sc.nextInt();

        System.out.println("Enter the Float value:");
        fFloat = sc.nextFloat();

        System.out.println("Enter the Double vallue:");
        dDouble=sc.nextDouble();


        System.out.println("Byte:"+bByte);
        System.out.println("Short:"+sShort);
        System.out.println("Integer:"+iInt);
        System.out.println("Float:"+fFloat);
        System.out.println("Double:"+dDouble);



    }
}
