package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class ContainsEx {
    public static void main(String[] args) {
        String str ="In God We trust, Bcos He abandon us";
        boolean result = str.contains("God");
        boolean result2= str.contains("He");
        System.out.println(result);
        System.out.println(result2);
    }
}
