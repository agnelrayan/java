package com.expertzlab.interfaceEx;

abstract class Employee {


    int empId = 10;
    String empName = "ABC";

   abstract void display();

    public void putData()
    {
        System.out.println("Id:" + empId + "" + "EmpName:" + empName);
    }
}
    class EmpResult extends Employee
    {
        public void display()
        {
            System.out.println("In Display Method");
        }
    }



public class AbstractEx  {
    public static void main(String[] args) {
        EmpResult obj = new EmpResult();
        obj.putData();
        obj.display();
    }
}
