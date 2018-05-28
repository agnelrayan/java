package com.expertzlab.sample3;

/**
 * Created by agnel on 5/25/18.
 */
public class StringDemos extends Object {
    public static void main(String[] args) {
        String str="Helo HI";
        System.out.println(str.substring(3));
        String str2="Hi,hw,do+ you, do, hw+ are, the, things";
      //  System.out.println(str2.split(" "));
        String[] x=str2.split("do");
        for(String x2:x){
            System.out.println(x2);

        }

    }
}
