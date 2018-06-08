package com.expertzlab.Basics;

import org.apache.spark.sql.execution.vectorized.ColumnVector;

import java.util.Arrays;

/**
 * Created by agnel on 3/5/18.
 */
public class SplitDemo {
    public static void main(String[] args) {
        int input[] ={10,20,30,40,50};
        int n=input.length;
        int a[]=new int[n/2];
        int b[] = new int[n-a.length];


        for(int i=0;i<n;i++){
            if(i<a.length){
                a[i]=input[i];
            }
            else{
                b[i-a.length]=input[i];
            }
        }
       // System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(b));
    }
}
