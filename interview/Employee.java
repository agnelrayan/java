package com.expertzlab.interview;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {

    int id;
    String name;
    public Employee(int id,String name){
        this.id=id;
        this.name=name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        return name.equals(employee.name);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }



}

class EmpMain{
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList();
        emp.add(new Employee(1,"AG"));
        emp.add(new Employee(2,"Ray"));
        emp.add(new Employee(20,"JOe"));

        for(Employee employee:emp){
            System.out.println(employee.id+","+employee.name);

        }

        emp.remove(1);

        System.out.println("Using Iterator...");

        Iterator<Employee> itr = emp.iterator();
        while(itr.hasNext()){
            //System.out.println(itr.next().toString());
            Employee itr2 = itr.next();
            System.out.println(itr2.id+","+itr2.name);
            itr.remove();

        }

        Iterator<Employee> itr2 = emp.iterator();
        while(itr.hasNext()){
            //System.out.println(itr.next().toString());
            Employee itr3 = itr.next();
            System.out.println(itr3.id+","+itr3.name);
          //  itr.remove();

        }




    }
}
