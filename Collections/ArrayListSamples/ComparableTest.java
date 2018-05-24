package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    int id;
    String name;

    public Employee(int id,String name){

        this.id=id;
        this.name=name;

            }

   public int compareTo(Employee obj){
        //System.out.println(id);
        //System.out.println(obj.id);
        if(id>obj.id)
            return 1;
        else if(id<obj.id)
            return -1;
        else
            return 0;

    }


}


public class ComparableTest {
    public static void main(String[] args) {
        Employee obj = new Employee(10,"ABC");
        Employee obj2 = new Employee(5,"AG");
        Employee obj3 = new Employee(20,"Ray");

        ArrayList<Employee> al = new ArrayList();

        al.add(obj);
        al.add(obj2);
        al.add(obj3);
        Collections.sort(al);

      //  al.add(10);
     //   al.add(20);



       for(Employee emp:al)
           System.out.println("Id:"+emp.id+ " "+ emp.name);

    }
}
