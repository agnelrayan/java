package com.expertzlab.StaticEx;

/**
 * Created by geo on 28/7/17.
 */
public class StaticEx {


    static int x;

    public static void main(String[] args) {
        StaticEx obj = new StaticEx();
        obj.x=1;
        System.out.println(obj.x);

        System.out.println(StaticEx.x);

    }



}
