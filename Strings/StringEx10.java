package com.expertzlab.Strings;
public class StringEx10 {
    public static void main(String[] args) {
        //append method

        StringBuffer str = new StringBuffer("agnel");
        str.append("rayan");
        System.out.println(str);

        //StringBuffer str2="agnel";

        //insert method

        StringBuffer str2 = new StringBuffer("agnel");
        System.out.println("Insert Method:"+str2.insert(4,"rayan"));//agnelrayan

        StringBuffer str3 = new StringBuffer("agnel");
        System.out.println(str3.insert(1,"anto"));

        //replace with
        StringBuffer str4 = new StringBuffer("agnel");
        System.out.println("Replace Method:"+str4.replace(1,4,"anto"));//aantol

        //delete method

        StringBuffer str5 = new StringBuffer("agnel");
        System.out.println(str5.delete(0,3));//ael

        //reveremethod
        StringBuffer str6 = new StringBuffer("welcome");
        System.out.println(str6.reverse());//emoclew

        //capacity method
        StringBuffer str8 = new StringBuffer();
        System.out.println(str8.capacity());//16

        StringBuffer str7 = new StringBuffer("agnel");
        System.out.println(str7.capacity());//21


    }
}
