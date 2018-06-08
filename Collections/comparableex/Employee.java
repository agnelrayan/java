package com.expertzlab.Collections.comparableex;


import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    int id;
    String name;

    public Employee(int id, String name){
        this.id=id;
        this.name=name;
    }
   public int compareTo(Employee obj){
       if(id==obj.id)
           return 0;
       else if(id>obj.id)
           return 1;
       else
           return -1;

   }


}
