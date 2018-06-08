package com.expertzlab.Collections.HashcodeEqualsMethodEx;

/**
 * Created by agnel on 5/25/18.
 */
public class EmployeeM {
    public static void main(String[] args) {
        Employee e1 = new Employee(10,"XY");
        Employee e2 = new Employee(10,"XY");
        System.out.println(e1.equals(e2));
    }
}
