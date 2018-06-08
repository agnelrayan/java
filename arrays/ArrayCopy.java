package com.expertzlab.arrays;


public class ArrayCopy {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        a1[0]=1;
        a1[1] = 2;
        a1[2]=5;

        int[] a2 = new int[15];
        System.arraycopy(a1,0,a2,0,4);
        System.out.println(a2[1]);
        a2[1]=10;
        System.out.println(a2[1]);

        System.out.println("Enhanced For Loop");
        for(int i:a2){
            System.out.println(i);
        }

      /*  int[] a3 = new int[20];
        System.arraycopy(a2,0,a3,0,0);

        a3[1]=20;
        System.out.println(a3[1]);

        a3=a2;
        System.out.println(Arrays.toString(a3));*/
    }

    public void displayArrayCopy(){
        System.out.println("IN Array Copy Class with Display method...");
    }




}
