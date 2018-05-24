package com.expertzlab.sample2;

/**
 * Created by agnel on 5/6/18.
 */
public class PalindromeWord {
    public static void main(String[] args) {
        String str = "amma";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev =rev+str.charAt(i);
        }
        if(rev.equals(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
