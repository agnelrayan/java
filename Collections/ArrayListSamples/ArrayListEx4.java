package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;

/**
 * Created by Agnel on 13/10/17.
 */
public class ArrayListEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<=10;i++)
            numbers.add(i);
        change(numbers,5);
        display(numbers);
    }

    static void display(ArrayList arr){

        for(int i=0;i<arr.size();i++)
            System.out.println(arr.get(i)+" ");
            System.out.println();
    }

    static void change(ArrayList<Integer> arr,int amount){
        int value;
        for(int i=0;i<arr.size();i++){
            value=arr.get(i);
            arr.set(i,value+amount);
        }
    }
}
