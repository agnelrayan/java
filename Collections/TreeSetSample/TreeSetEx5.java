package com.expertzlab.Collections.TreeSetSample;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx5{

    public static void main(String a[]){

        TreeSet<String> ts = new TreeSet<String>(new MyStrComp());
        //TreeSet<String> ts = new TreeSet();
        ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        ts.add("WHITE");
        ts.add("BROWN");
        ts.add("YELLOW");
        ts.add("BLACK");
        System.out.println(ts);


    }
}

class MyStrComp implements Comparator<String> {

   // @Override
    public int compare(String str1, String str2)
    {
        return str1.compareTo(str2);
    }

}