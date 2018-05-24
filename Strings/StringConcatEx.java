package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class StringConcatEx {
    public static void main(String[] args) {
        String str ="String is Immutable";
        str.concat("Mutating");
        System.out.println(str);
        str=str.concat("Explicitly Mutatting");
        System.out.println(str);
    }
}
