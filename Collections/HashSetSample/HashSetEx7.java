package com.expertzlab.Collections.HashSetSample;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx7 {
    public static void main(String[] args) {
        String str="hi how are you ";
        String str2[]=str.split(" ");
        Set<String> words = new HashSet<String>(Arrays.asList(str));
        //words.add(str2[0],str2[1],str2[2],str2[3]);

        for(String word:words){
            System.out.println(word);
        }

        for(String obj:words)
            words.add(str);
        System.out.println(words.size()+"Distinct words:"+words);

        Set<String> s = new HashSet<String>();
        for (String a : s)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }


}
