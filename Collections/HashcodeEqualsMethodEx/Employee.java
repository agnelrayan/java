package com.expertzlab.Collections.HashcodeEqualsMethodEx;

/**
 * Created by agnel on 5/25/18.
 */
public class Employee {
    int empId;
    String empName;

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != employee.empId) return false;
        return empName.equals(employee.empName);
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + empName.hashCode();
        return result;
    }



    public Employee(int empId,String empName){
        this.empId=empId;
        this.empName=empName;

    }
}
