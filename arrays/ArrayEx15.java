package com.expertzlab.arrays;

public class ArrayEx15 {
    public static void main(String[] args) {
        int ar[]={10,20,30};
        ArrayEx15.print(ar);

        double ar2[]={10.10,20.20,30.30};
        ArrayEx15 obj = new ArrayEx15();
        obj.print2(ar2);
        print(ar);
    }

    public void print2(double ar2[]){
        for(double i2:ar2){
            System.out.println(i2);

        }

    }

    public static void print(int ar[]){
        for(int i=0;i<ar.length;i++)
            System.out.println(ar[i]);

        System.out.println("Using Enhanced for loop:");

        for(int i:ar)
            System.out.println(i);
    }
}

