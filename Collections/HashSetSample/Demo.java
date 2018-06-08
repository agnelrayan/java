package com.expertzlab.Collections.HashSetSample;



import java.util.HashSet;
import java.util.TreeSet;


public class Demo {
    public static void main(String[] args) {
        String text;
        text = " hi how do you do how are the things";
        String[] words=text.split(" ");
        for(String w:words){
            System.out.println(w);
        }

        System.out.println("Total No.of Words:"+text.length());

        HashSet<String> set = new HashSet<String>();
        for(String w:words){
           set.add(w);
            //System.out.println(w);
        }
        //set.add(words);
        System.out.println(set);

        System.out.println("No. Of Unique Words:"+set.size());
    }
}
