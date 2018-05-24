package com.expertzlab.annotations;

import java.util.ArrayList;

/**
 * Created by agnel on 4/12/18.
 */
public class Demo {
    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList li = new ArrayList();
        li.add("Thomma");
        li.add("John");
        li.add(32);

        System.out.println(li);

        for(Object obj:li){
            System.out.println(obj);
        }

    }
}
