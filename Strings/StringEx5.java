package com.expertzlab.Strings;

public class StringEx5 {
    public static void main(String[] args) {
        char ch[]={'a','g','n','e','l'};
        System.out.println(ch);

        String str = new String(ch);
        System.out.println("Putting into String:"+str);

        String str2 = new String("agnel");

        if(str.equals(str2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        String str3="agnel";
        String str4="agnel";
        String str5 = new String("agnel");

        if(str3.equals(str4)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        if(str2==str5){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }




    }
}
