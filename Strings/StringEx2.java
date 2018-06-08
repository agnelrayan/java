package com.expertzlab.Strings;

/**
 * Created by geo on 28/9/17.
 */
public class StringEx2 {
    public static void main(String[] args) {
    char ch[]={'w','e','l','c','o','m','e'};
        System.out.println(ch);

        String str2 = new String(ch);
        System.out.println(str2);

        String str = "welcome";
        System.out.println(str);


         str.concat("helo");
         System.out.println(str);

        str=str.concat("helo");
        System.out.println(str);




       /* if(ch==str)
            System.out.println("Equal");
            else
            System.out.println("Not equal");*/
    }

}

