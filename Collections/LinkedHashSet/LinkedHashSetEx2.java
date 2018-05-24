package com.expertzlab.Collections.LinkedHashSet;

import java.util.LinkedHashSet;

/**
 * Created by Agnel on 17/10/17.
 */
public class LinkedHashSetEx2 {
    public static void main(String[] args) {
        LinkedHashSetEx obj = new LinkedHashSetEx(1,"AG");
        LinkedHashSetEx obj2 = new LinkedHashSetEx(2,"Ray");
        LinkedHashSetEx obj3 = new LinkedHashSetEx(3,"Anto");
        LinkedHashSet<LinkedHashSetEx> li = new LinkedHashSet();
        li.add(obj);
       // li.add(obj2);
        li.add(obj2);
        li.add(obj3);
        li.add(new LinkedHashSetEx(4,"Joe"));
        li.add(new LinkedHashSetEx(4,"Joe"));

       /* System.out.println(li.size());
        li.remove(obj);*/



       for(LinkedHashSetEx it:li){
           System.out.println("Student Id:"+it.studId+" "+"Student Name:"+it.studName);
       }

    }
}
