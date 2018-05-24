package com.expertzlab.Collections.LinkedListSample;

import java.util.*;

public class LinkedListEx5 {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<String>();
        //List<String> students = new LinkedList<String>();
        //Queue<String> students = new LinkedList<String>();
        //Deque<String> students = new LinkedList<String>();

        students.add("Ag");
        students.add("Ray");
        students.add("Joy");
        students.add("Jose");

        //students.stream().forEach(System.out::println);

        System.out.println("Using For Each Loop....");
        for(String obj:students){
            System.out.println(obj);
        }

        //convert List to stream

        /*
        //Array to Linked List

        Integer[] numbers = {1,2,3,4,5};
        List<Integer> numbersList = new LinkedList();
        for(Integer s : numbers){
            numbersList.add(s);
        }
        System.out.println(numbersList);


        String[] names = {"AG","Anto","Ray","Joy"};
        List<String> nameList = new LinkedList<String>();
        for(String obj:names) {
            nameList.add(obj);
            //System.out.println(nameList);
        }
        System.out.println(nameList);*/

       /* System.out.println("Offer Method...");
        students.offerFirst("Ray");*/

        //getLastMethod()..
        /*
        String getlast=students.getLast();
        System.out.println("GetLastMethod:"+getlast);
        */

        /*
       //getFirst Method..
        String getfirst=students.getFirst();
        System.out.println("getFirst method:"+getfirst);*/



        /*
        //Object poll(): It returns and removes the first item of the list.
        students.poll();

        System.out.println("Using For Each Loop with Poll method..");
        for(String obj:students){
            System.out.println(obj);
        }*/

      /*
      //addFirst Method..
        students.addFirst("AAA");
        System.out.println("Using For Each Loop with addFirst Method..");
        for(String obj:students){
            System.out.println(obj);
        }*/


       /*
        //addLast method...
       students.addLast("Joshua");
        System.out.println("Using For Each Loop with addLast Method..");
        for(String obj:students){
            System.out.println(obj);
        }*/


        //Forward and Backword direction

      /*  System.out.println("Using Iterator....");
        ListIterator itr = (ListIterator)students.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Using BackForward Direction...");
          while(itr.hasPrevious()){
              System.out.println(itr.previous());
          }*/
    }
}
