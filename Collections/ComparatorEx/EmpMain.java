package com.expertzlab.Collections.ComparatorEx;


import java.util.ArrayList;
import java.util.Collections;

public class EmpMain {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList();
        al.add(new Employee(1,"AG"));
        al.add(new Employee(3,"AB"));
        al.add(new Employee(2,"Jose"));

        System.out.println("Using Id Sorting....");
        Collections.sort(al,new EmpIdComparator());

        for(Employee obj: al){
            System.out.println(obj.id+","+obj.name);
        }

        System.out.println("Using Name Sorting....");
        Collections.sort(al,new EmpNameComparator());
        for(Employee obj2: al){
            System.out.println(obj2.id+","+obj2.name);
        }

    }
}
