package com.expertzlab.Strings;
public class StringEx11 {
    public static void main(String[] args) {

      //append method
        StringBuilder str = new StringBuilder("agnel");
        str.append("rayan");
        System.out.println(str);//agnelrayan

        //insert method
        StringBuilder str2 = new StringBuilder("agnel");
        str2.insert(5,"ray");
        System.out.println(str2);//agnelray

        //replace method
        StringBuilder str3 = new StringBuilder("agnel");
        str3.replace(1,2,"anto");
        System.out.println(str3);//aantonel

        //delete method
        StringBuilder str4 = new StringBuilder("agnel");
        str4.delete(1,4);
        System.out.println(str4);//al

        //reverse metho

        StringBuilder str5 = new StringBuilder("welcome");
        str5.reverse();
        System.out.println(str5);//emoclew


    }
}
