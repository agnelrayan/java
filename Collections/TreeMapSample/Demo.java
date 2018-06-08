package com.expertzlab.Collections.TreeMapSample;

import java.util.TreeMap;

public class Demo {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("d", "first element");
        map.put("h", "second element");
        map.put("f", "third element");
        map.put("a", "fourth element");
        map.put("c", "fifth element");
        map.put("c","Sixth element");
        System.out.println(map);

    }

}
