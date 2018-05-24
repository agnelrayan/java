package com.expertzlab.sample2.collection.comparable;

import java.util.PriorityQueue;

/**
 * Created by agnel on 5/22/18.
 */
public class EmployeeM {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "AG", 9434);
        Employee e2 = new Employee(102, "Ray", 9034);
        Employee e3 = new Employee(103, "AB", 90343);
        PriorityQueue<Employee> queue = new PriorityQueue();
        queue.add(e1);
        queue.add(e2);
        queue.add(e3);

        for (Employee eq : queue) {
            System.out.println("Emp Id:" + eq.empId + "Emp Name:" + eq.empName + "Employee Salary:" + eq.empSalary);
        }
    }

}
