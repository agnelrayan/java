package com.expertzlab.examples;

/**
 * Created by agnel on 5/30/18.
 */
public class ThirdMin {

    public static void thirdMin(int ar[]){
        int i;

        if(ar.length<3){
            System.out.println("Not Valid Input");
        }
        int first=ar[0];
        for(i=1;i<ar.length;i++){
            if(ar[i]<first)
                first=ar[i];

            //find first smallest


        }
       // System.out.println("First Smallest:"+first);

        int second=ar[0];
        for(i=1;i<ar.length;i++){
            if(ar[i]<second&&ar[i]>first){
                second=ar[i];
            }
        }
      //  System.out.println("Second Smallest..."+second);

        int third =ar[0];
        for(i=1;i<ar.length;i++){
            if(ar[i]<third && ar[i]>second &&ar[i]>first){
                //if(a[i]>third&&a[i]<second&&a[i]<first){
                third=ar[i];

            }
        }
        System.out.println("Third Smallest:"+third);
    }
    public static void main(String[] args) {
        int ar[]={10,5,20,15,30,22};
        int size=ar.length;
        thirdMin(ar);
    }
}
