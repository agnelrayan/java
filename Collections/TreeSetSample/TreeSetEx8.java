package com.expertzlab.Collections.TreeSetSample;


import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetEx8 {
    public static void main(String[] args) {
        String text;
        text="I am the way, truth and life without me you shall not have life. In me you can find life" +
                "I am the Resurrection, I am source of Life, I am the Alpha and I am the Omega, I am the First and I am" +
                "the Last , No one before me and No one after me. There is one Faith, There is Baptism, There is one God" +
                "God of all mankind, I am living, I am God of all. I have chosen you, I am carved in palm of my hand" +
                "you are my offspring, I never forget you I never abandon you, because I love you with an everlasting life - Amen";
        String[] words = text.split(" ");

        System.out.println("Using List...");
        List <String> li = Arrays.asList(words);
        System.out.println(li);

        TreeSet<String> set = new TreeSet<String>(li);
       // System.out.println(set);

        set.add(text);
        System.out.println(set);


        /*
        //System.out.println(words);
        for(String s:words){
            System.out.println(s);
        }

        System.out.println("Total No of words:"+words.length);

        TreeSet<String> set = new TreeSet();
        set.add(words);

        for(String s:set){
            System.out.println(s);
        }

     /*   for(String s:set)
        {
            set.add(s);
        }*/

        /*System.out.println("Size of Tree:"+set.size());
        for(String s:set){
            System.out.println(s);
        }*/
    }
}
