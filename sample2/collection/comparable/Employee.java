package com.expertzlab.sample2.collection.comparable;

/**
 * Created by agnel on 5/22/18.
 */
public class Employee implements Comparable<Employee> {
    int empId;
    String empName;
    float empSalary;

    public Employee(int empId,String empName,float empSalary){
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;

    }

    public int compareTo(Employee o) {
        //return this.empId-o.empId;
        return this.empName.compareTo(o.empName);
    }
}
