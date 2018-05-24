package com.expertzlab.sample3;

/**
 * Created by agnel on 5/9/18.
 */
public class Employee {
    int empId;
    String empName;
   static String companyName="ExpertZLab";

    public Employee(int eid,String ename){
        empId=eid;
        empName=ename;

    }

    public static void EmpSalary(){
        System.out.println("Employee Salary Method");
    }


    public void displayEmpDetails(){
        System.out.println("Employee Id: "+empId);
        System.out.println("Employee Nmae: "+empName);
        System.out.println("Company Name: " +companyName);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(10,"AB");
        Employee e2 = new Employee(20,"AC");
        Employee e3 = new Employee(30,"AD");
        e1.displayEmpDetails();
        //e2.displayEmpDetails();
       // e3.displayEmpDetails();
        e1.empId=100;
        e1.companyName="EXper";
        e1.displayEmpDetails();



    }

}
