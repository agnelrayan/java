package com.expertzlab.sample2;

import java.util.Scanner;

/**
 * Created by agnel on 5/7/18.;
 */
public class SumAverage {
    public static void main(String[] args) {
        System.out.println("Enter number and 0 exit");
        int count=0,sum=0,num;

        Scanner sc = new Scanner(System.in);
        while((num=sc.nextInt())>0){

         count++;
         sum+=sum;

        }
        System.out.println("Count:"+count);
        System.out.println("Number:"+num);
        System.out.println("Average:"+(sum/count));
    }
}
