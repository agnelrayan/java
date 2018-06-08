package com.expertzlab.Collections.ArrayListSamples;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListEx19 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("AG");
        names.add("AB");
        names.add("AC");
        System.out.println(names);



        System.out.println("Using For each loop..");
        for(String obj:names){
            System.out.println(obj);
        }

        //indexOf....
        int i=names.indexOf("AG");
        System.out.println("Index of:"+i);

        //size() method...
        int size=names.size();
        System.out.println("Size of ArrayList:"+size);

        ArrayList<String> names2 =new ArrayList(2);
        names2.ensureCapacity(3);
        names2.add("AG");
        names2.add("AB");
        names2.add("AD");
        names2.add("AC");
        names2.add("AE");

        int size2=names2.size();
        System.out.println("Size2:"+size2);
        /*
// this will increase the capacity of the ArrayList to 15 elements
     //   names2.ensureCapacity(20);
        int size3=names2.size();
        System.out.println("Size3:"+size3);*/

        names2.add("AF");
        names2.add("AG");

        System.out.println("Using for each loop");
        for(String obj2:names2){
            System.out.println(obj2);
        }

        /*
        String[] str ={"Ag","Anto","Ray","Jose","JOY"};
        ArrayList<String> names3 = new ArrayList<String>(Arrays.asList(str));
       // System.out.println("After ArrayList"+names3);
        for(String obj7:names3){
            System.out.println(obj7);
        }*/


      /*  System.out.println("After Sorting...");
        Collections.sort(names2);
        //System.out.println("Using for each loop");
        for(String obj2:names2){
            System.out.println(obj2);
        }*/

        /*
        System.out.println("Set Method...");
        names2.set(0,"Anto");

        System.out.println("Using for each loop");
        for(String obj2:names2){
            System.out.println(obj2);
        }*/


        /*
        System.out.println("AddAll method with index position");
        names2.addAll(3,names);
        for(String obj7:names2){
            System.out.println(obj7);
        }*/

      /* System.out.println("AddAll Method...");
        names2.addAll(names);
        for(String obj6:names2){
            System.out.println(obj6);
        }*/


        /*
        //lastindexof method
        int lastIndex=names2.lastIndexOf("AB");
        System.out.println("LastIndexOf method:"+lastIndex);
        */

        /*

        //Is Empty Method
        boolean isEmpty=names2.isEmpty();
        System.out.println("Is Empty Method:"+isEmpty);*/

        /*
        //Get Method...
        String get=names2.get(1);
        System.out.println("Get Method:"+get);*/


        /*
        System.out.println("Contains Method..");
        boolean contains=names2.contains("AG");
        System.out.println("Contains method.."+contains);*/

       /* System.out.println("Using clone method....");
        Object names3=names2.clone();
        for(String obj5:names2){
            System.out.println(obj5);
        }*/

        /*//clear method
        names2.clear();
        System.out.println("Clear Method:"+names2.size());*/

//        int capacity=names2.ensureCapacity(3);


      /*  //Remove method...
        System.out.println("After Removing method");
        names2.remove(0);
        System.out.println("Using for each loop");
        for(String obj2:names2){
            System.out.println(obj2);
        }*/


       /* //removeAll method....
        names2.removeAll(names);
        System.out.println("Removeall() Method...");
        for(String obj3:names2){
            System.out.println(obj3);
        }*/


        //retainAll method..
        /*System.out.println("AFter retainAll() method...");
        names2.retainAll(names);
        for(String obj4:names2){
            System.out.println(obj4);
        }*/




    }


}
