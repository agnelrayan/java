package com.expertzlab.sample2;

/**
 * Created by agnel on 5/6/18.
 */
public class PalindromeEx {
    public static void main(String[] args) {
        int n=132;
        int temp=n;
        int a=0;
        int revInt=0;
        while(n>0){
            a=n%10;
            revInt=(revInt*10)+a;
            n=n/10;

        }
        System.out.println("RevInt:"+revInt);
        if(temp==revInt)
            System.out.println("Is Palindrome:"+revInt);
        else
            System.out.println("Is Not Palindrome:"+revInt);
    }

}
