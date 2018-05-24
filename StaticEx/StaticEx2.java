package com.expertzlab.StaticEx;

/**
 * Created by geo on 21/9/17.
 */
public class StaticEx2 {

    static int count=0;

    public StaticEx2(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticEx2 obj  = new StaticEx2();
        StaticEx2 obj2 = new StaticEx2();
        StaticEx2 obj3 = new StaticEx2();


    }
}
