package com.expertzlab.java8features;

import java.util.ArrayList;

/**
 * Created by agnel on 5/31/18.
 */
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Ag");
        al.add("AB");
        al.add("CA");
        al.add("XY");

      /*  for(String list:al){
            System.out.println(list);
        }*/


      al.forEach(
              (x)-> System.out.println(x)

      );
        System.out.println("Size of ARLIst:"+al.size());
    }
}
