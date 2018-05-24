package com.expertzlab.Collections.LinkedListSample;


import java.util.*;

/**
 * Created by Agnel on 16/10/17.
 */
public class LinkedListEx2 {
    public static void main(String[] args) {
        LinkedList<Object> li = new LinkedList();
        li.add(10);
        li.add(30);
        li.add(20);
        li.add(40);



        System.out.println("After Iterating first list:");
        for (Object obj : li) {
            System.out.println(obj);

        }

        LinkedList li2 = new LinkedList();
        li2.add(10);
        li2.add(20);
        li2.add(50);
        li2.add(60);

        System.out.println("Forward direction:");
        ListIterator it2 = li2.listIterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        //ListIterator it = li2.listIterator();

        System.out.println("Backward direction:");
        while(it2.hasPrevious()){
            System.out.println(it2.previous());
        }





        System.out.println("After Iterating second list:");
        for (Object obj2 : li2) {
            System.out.println(obj2);

        }
       /* li.removeAll(li2);//30 40
        System.out.println("After removeAll() from li to li2:");
        for(Object obj:li){
            System.out.println(obj);

        }*/

       // System.out.println("After retailAll() from li to li2:");

        li.retainAll(li2);
        System.out.println("After retailAll() from li to li2:");
        for(Object obj:li){
            System.out.println(obj);//10 20

        }

    }




}

       /* li.addAll(li2);

        System.out.println("After addingAll:");
        for(Object obj:li){
            System.out.println(obj);

        }*/

      /*  System.out.println("After retailAll() from li to li2:");

        li.retainAll(li2);
        System.out.println("After retailAll() from li to li2:");
        for(Object obj:li){
            System.out.println(obj);

        }*/



