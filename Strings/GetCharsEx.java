package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class GetCharsEx {
    public static void main(String[] args) {
        String str = "Helo hw are you";
       // char ch[]= new char[10];
        char ch[] =new char[10];
        try{
            str.getChars(5,11,ch,0);
            System.out.println(ch);
        }
        catch(Exception e){
            System.out.println(e);
        }
        //ch=str.getChars(6,10,ch,0);

        //int i=str.getChars(6,10,ch,0);
    }
}
