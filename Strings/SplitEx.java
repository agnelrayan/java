package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class SplitEx {
    public static void main(String[] args) {
        String str = "How are you";

       // String[] str2 = str.split("\\s");
        String[] str3 = str.split("\\s");

        for(String str4:str3)
            System.out.println(str4);

       // System.out.println(str2);


    }
}
