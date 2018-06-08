package com.expertzlab.Basics;

class Employee
{
    String empName;
    private int salary; // It is visible in Employee class only

    public Employee(String strEmp)
    {
        empName = strEmp;
    }
    public Employee()
    {
        System.out.println("Default Constructor!");
    }
    public void setSalary(int empSlr)
    {
        salary = empSlr;
    }


    public void displayDetail()
    {
        System.out.println("Employee Name  : " + empName);
        System.out.println("Employee salary :" + salary);
    }
    public void output(){
        System.out.println("Create Object");
        Employee obj = new Employee();
        obj.displayDetail();
    }
}

class PrivateVariableDemo
{
    public static void main(String args[])
    {
        Employee empObj = new Employee("Rayan");
        Employee obj2 = new Employee();
        empObj.displayDetail();
        empObj.setSalary(5000);
        empObj.displayDetail();
        //empObj.salary=1000;
        //empObj.empName="Ray";
    }
}
