package com.expertzlab.Collections.HashSetSample;


import java.util.HashSet;

public class ClientTest {
    public static void main(String[] args) {
        Employee employee = new Employee(24,"AG");
        Employee employee1 = new Employee(25,"AG");
        Employee employee2 = new Employee(24,"AG");

       /* HashSet<Employee> employees = new HashSet();
        employees.add(employee);*/
       //System.out.println(employees.contains(employee2));
        System.out.println("employee.hashCode():  " + employee.hashCode()
                + "  employee2.hashCode():" + employee2.hashCode());

        //System.out.println(employee==employee2);//false
        System.out.println(employee.equals(employee2));//true
        System.out.println(employee1.hashCode());
    }

}

