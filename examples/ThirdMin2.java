package com.expertzlab.examples;

/**
 * Created by agnel on 5/30/18.
 */
public class ThirdMin2 {


    public static void thirdMin(int a[],int size){

        int max;
        int i;



        if(size<3){
            System.out.println("Not Valid Input");
        }

        //Find First Largest of Element

        int first =a[0];

        for(i=1;i<size;i++) {

            if (a[i] < first)
                first = a[i];

            //find Second Largest
        }
        int second=a[0];
        for(i=1;i<size;i++){
            if(a[i]<second&&a[i]>first){
                second=a[i];

            }

        }
        //  System.out.println("Second Maximum:"+second);

        int third=a[0];
        for(i=1;i<size;i++){
            if(a[i]<third&&a[i]>second&&a[i]>first){
                third=a[i];
            }
        }

        System.out.println("Third Minimum:"+third);

    }

    // System.out.println("Maximum:"+first);






    public static void main(String[] args) {
        int a[] ={20,344,30,90,100,40,50,10,60};

        int size = a.length;

        thirdMin(a,size);


        // int ar[] = new int[10];



    }
}