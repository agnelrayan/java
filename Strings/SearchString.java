package com.expertzlab.Strings;

/**
 * Created by geo on 28/9/17.
 */
public class SearchString {
    public static void main(String[] args) {
        String str = "Welcome to Java";
        int i = str.indexOf("Welcome");

        if(i==-1)
            System.out.println("Not found");
        else
            System.out.println("Word Found is:"+i);

    }
}
