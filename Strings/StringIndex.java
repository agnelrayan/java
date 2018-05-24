package com.expertzlab.Strings;

/**
 * Created by geo on 28/9/17.
 */
public class StringIndex {
    public static void main(String[] args) {
      /*  String str ="Helo hw r u hw do u do";

        int index = str.indexOf("hw");
        System.out.println(index);

        char index2 = str.charAt(0);
        System.out.println(index2);



        int index3 = str.indexOf('h');
        System.out.println(index3);

        int index4 = str.indexOf('e');
        System.out.println(index4);*/

        String str5 = "Helo World";
        System.out.println(str5.replace('H','W'));
        System.out.println(str5.replaceFirst("Helo","HI"));
        System.out.println(str5.replaceAll("World","Hi Friends"));

        String str2 ="Ag";
        String str3="Agn";

        System.out.println(str2.equals(str3));

        System.out.println((str2==str3));




    }
}
