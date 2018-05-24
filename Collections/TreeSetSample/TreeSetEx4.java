package com.expertzlab.Collections.TreeSetSample;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetEx4{

    public static void main(String a[]){
        String[] strArr = {"one","two","three","four","four","five"};
        //convert string array to list
        List<String> tmpList = Arrays.asList(strArr);
        //create a treeset with the list, which eliminates duplicates
        TreeSet<String> unique = new TreeSet<String>(tmpList);
        System.out.println(unique);


        Integer[] intArr =new Integer[]{2,4,5,6,3,7,6,8,9,10,23,45,12,-1,-2,-99,40,50};

        List<Integer> list = Arrays.asList(intArr);
        TreeSet<Integer> ts = new TreeSet<Integer>(list);
        System.out.println(ts);

        String[] stringArr  ={"Ag","Ray","Anto","Ag","JOy"};
        List<String> strList = Arrays.asList(strArr);
        TreeSet<String> treeSet2 = new TreeSet<String>(strList);
        System.out.println(treeSet2);
    }
}