package com.expertzlab.Collections.ComparatorEx;


import com.expertzlab.Collections.comparableex.*;

import java.util.ArrayList;
import java.util.Collections;

public class DepartmentMain {
    public static void main(String[] args) {
        ArrayList<Department> li = new ArrayList();
        li.add(new Department(10,"XY"));
        li.add(new Department(30,"IJ"));
        li.add(new Department(20,"PQ"));
        li.add(new Department(15,"zy"));
        Collections.sort(li,new DeptIdComparator());

        System.out.println("Iterate by Id Comparator..");
        for(Department obj:li){
            System.out.println(obj.id+","+obj.name);
        }


        Collections.sort(li,new DepartmentNameComparator());
        System.out.println("Iterate by Name Comparator..");
        for(Department obj:li){
            System.out.println(obj.id+","+obj.name);
        }

    }
}
