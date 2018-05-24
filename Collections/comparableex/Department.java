package com.expertzlab.Collections.comparableex;

public class Department implements Comparable<Department> {
    int id;
    String name;

    public Department(int id,String name){
        this.id=id;
        this.name=name;

    }

    public int compareTo(Department department) {
        if(id==department.id)
            return 0;
        else if(id>department.id)
            return 1;
        else
            return -1;
    }
}
