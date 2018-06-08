package com.expertzlab.Strings;

/**
 * Created by geo on 28/9/17.
 */
public class StringEx {
    public static void main(String[] args) {
        String str ="Ag";

        System.out.println("Name is:"+str);

        String str2="Ag";
        System.out.println("Second Name is:"+str2);

        boolean result=str.equals(str2);
      //  System.out.println(result);

        boolean result2 = str==str2;
     //   System.out.println("Result2:"+result2);

        int i = str.hashCode();
        int j = str2.hashCode();
      //  System.out.println("HashCode in i:"+i+"HashCode in j:"+j);

        String str3 = new String("Ag");

        boolean result3 = str2.equals(str3);
        System.out.println("Result3-"+result3);

        boolean result4 = ("Result4:"+str2==str3);
        System.out.println(result4);


        //int i = str.hashCode();
        int k = str3.hashCode();
        System.out.println("HashCode in i:"+i+"HashCode in K:"+k);

        int kk = str2.hashCode();
        System.out.println("HashCode in i:"+i+"HashCode in K:"+kk);

        String str5 = new String("Ag");
        boolean result5=str5.equals(str3);
        System.out.println("Result5:"+result5);







    }
}

