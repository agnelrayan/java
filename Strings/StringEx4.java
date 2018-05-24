package com.expertzlab.Strings;

/**
 * Created by geo on 3/10/17.
 */
public class StringEx4 {
    public static void main(String[] args) {



        StringBuffer str =new StringBuffer("AG");
        str.append("Ray");
        System.out.println("String Buffer Class"+str);


        StringBuffer str4 = new StringBuffer("AG");

        boolean result =str4.equals(str);
        System.out.println("String buffer is:"+result);

        StringBuilder str3 =new StringBuilder("Ag");
        str3.append("Ray");
        System.out.println("String Builder Class"+str3);

        StringBuilder str5 = new StringBuilder("Ag");
        boolean result2=str5.equals(str);
        System.out.println("String Builder"+result2);


        String str2 = new String("Ag");
        str2.concat("Ray");
        System.out.println("String Class"+str2);

        String str6 = new String("Ag");
        boolean result3=str6.equals(str2);
        System.out.println("String class"+result3);



        

    }
}
