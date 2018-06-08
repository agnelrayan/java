package com.expertzlab.Collections.comparableex;


import java.util.ArrayList;
import java.util.Collections;

public class MainEmp {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList();
        al.add(new Employee(10,"AG"));
        al.add(new Employee(20,"Ray"));
        al.add(new Employee(15,"JOy"));
        Collections.sort(al);
        for(Employee obj:al){
            System.out.println(obj.id+","+obj.name);
        }

    }
}
