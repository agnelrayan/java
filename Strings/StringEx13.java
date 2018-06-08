package com.expertzlab.Strings;
public class StringEx13 {
    public static void main(String[] args) {
        /*char ch[]={'w','e','l','c','o','m','e'};
        String str = new String(ch);
        System.out.println(ch);

        String str2 = new String("hi");
        System.out.println(str2);*/

        String str3 ="helo";
        System.out.println(str3);

        str3=str3.concat("welcome");
        System.out.println("String class:"+str3);

        StringBuffer str5 = new StringBuffer("welcome");
        str5.append("helo");
        System.out.println("By StringBuffer:"+str5);

        StringBuilder str6 = new StringBuilder("welcome");
        str6.append("helo");
        System.out.println("By StringBuilder:"+str6);

    }
}
