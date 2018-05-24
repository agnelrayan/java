package com.expertzlab.Collections.LinkedListSample;

import java.util.*;

/**
 * Created by Agnel on 16/10/17.
 */
public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList();
        li.add(45);
        li.add(50);
        li.add(30);
        li.add(60);
        li.add(null);
        //  li.add("AG");

        System.out.println("After Iterating:");
        for (Integer obj : li) {
            System.out.println(obj);

        }

      /* Iterator itr = li.iterator();
        System.out.println("AFter Itreation:");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/

/*
        li.addFirst(5);

        System.out.println("After addFirst():");
        for (Object obj : li) {
            System.out.println(obj);

        }
        /*System.out.println("AFter addFirst():");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/


   /*     li.add(2, 22);
        System.out.println("After adding(2,22):");
        for (Object obj : li) {
            System.out.println(obj);

        }

        System.out.println("Get(0) is:" + li.get(0));

        //indexOf()
        System.out.println("Index of:" + li.indexOf(5));

        li.addLast(70);
        System.out.println("After addLast:");
        for (Object obj : li) {
            System.out.println(obj);

        }

        li.poll();
        System.out.println("After Poll:");
        for (Object obj : li) {
            System.out.println(obj);

        }
    }
}
  */

        // 1. boolean add(Object item): It adds the item at the end of the list.

     //   li.add(80);

        // 2. void add(int index, Object item): It adds an item at the given index of the the list.

       // li.add(2, 100);

        //3) boolean addAll(Collection c): It adds all the elements of the specified collection c to the list. It throws NullPointerException if the specified collection is null. Consider the below example –

        LinkedList<String> llistobj = new LinkedList<String>();
        ArrayList<String> arraylist= new ArrayList<String>();
        arraylist.add("String1");
        arraylist.add("String2");
        llistobj.addAll(arraylist);

        //void addFirst(Object item): It adds the item (or element) at the first position in the list.

                li.addFirst(150);

        //void addLast(Object item): It inserts the specified item at the end of the list.

                li.addLast(160);
        li.add(10);
        li.add(20);
        li.add(30);

        //void clear(): It removes all the elements of a list.

        llistobj.clear();

        // Object clone(): It returns the copy of the list.

                //For e.g. My linkedList has four items: text1, text2, text3 and text4.

        Object str= li.clone();
        System.out.println("After Cloing:" +str);
        int i = str.hashCode();
        System.out.println("hashcode of I:"+i);
        System.out.println("hashcode of li.hashcode"+li.hashCode());

        // boolean contains(Object item):
        // It checks whether the given item is present in the list or not. If the item is present then it returns true else false.

        boolean var = li.contains(150);

        // Object get(int index): It returns the item of the specified index from the list.

        // It will fetch the 3rd item from the list.
                Object var2 = li.get(2);

        //Object getFirst(): It fetches the first item from the list.

        Object var3 = li.getFirst();

        //Object getLast(): It fetches the last item from the list.

        Object var4= li.getLast();

        //int indexOf(Object item): It returns the index of the specified item.

        li.indexOf(150);

        //int lastIndexOf(Object item): It returns the index of last occurrence of the specified element.

        int pos = li.lastIndexOf(50);

        //Object poll(): It returns and removes the first item of the list.

        Object o = li.poll();

        // Object pollFirst(): same as poll() method. Removes the first item of the list.

        Object o2 = li.pollFirst();

        //Object pollLast(): It returns and removes the last element of the list.

        Object o3 = li.pollLast();

        //Object remove(): It removes the first element of the list.

        li.remove();

        //Object remove(int index): It removes the item from the list which is present at the specified index.

      //  li.remove(4);

        //Object remove(Object obj): It removes the specified object from the list.

        //li.remove(50);

        //Object removeFirst(): It removes the first item from the list.

        li.removeFirst();

        // Object removeLast(): It removes the last item of the list.

        li.removeLast();

        //Object removeFirstOccurrence(Object item): It removes the first occurrence of the specified item.

        li.removeFirstOccurrence(10);

        //Object removeLastOccurrence(Object item): It removes the last occurrence of the given element.

        li.removeLastOccurrence(20);

        //Object set(int index, Object item): It updates the item of specified index with the give value.

        li.set(2, 42);

        //int size(): It returns the number of elements of the list.

               // li.size();

    }

}
