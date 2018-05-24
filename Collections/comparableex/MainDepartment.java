package com.expertzlab.Collections.comparableex;


import java.util.ArrayList;
import java.util.Collections;

public class MainDepartment {
    public static void main(String[] args) {
        ArrayList<Department> li = new ArrayList();
        li.add(new Department(10,"XY"));
        li.add(new Department(30,"IJ"));
        li.add(new Department(20,"PQ"));
        li.add(new Department(15,"zy"));
        Collections.sort(li);

        System.out.println("Iterating by Id:");
        for(Department obj:li){
            System.out.println(obj.id+","+obj.name);
        }

    }
}
