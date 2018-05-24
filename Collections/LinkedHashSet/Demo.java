package com.expertzlab.Collections.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<String>();
        names.add("Ag");
        names.add("Arun");
        names.add("JOhn");
        names.add("JOy");
        names.add("Ag");
        names.add(null);
        names.add(null);

        for(String list:names){
            System.out.println(list);
        }
    }
}
