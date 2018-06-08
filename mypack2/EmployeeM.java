package mypack2;

import mypack.Employee;

/**
 * Created by agnel on 6/1/18.
 */
public class EmployeeM extends Employee{
    public EmployeeM(int empId, String empName, float empSalary) {
        super(empId, empName, empSalary);
    }

    public static void main(String[] args) {
        EmployeeM e = new EmployeeM(101,"Joe",30000);
        EmployeeM e2 = new EmployeeM(102,"John",40000);
        e.display();
        System.out.println();
        e2.display();


    }
}
