package com.expertzlab.Basics;
class BasicsEx5 {
    int empId;
    String empName;



    public BasicsEx5(int empId, String empName) {
        this();//call default constructor
        this.empId = empId;
        this.empName = empName;
        System.out.println("EmpId:" + empId + " " + "EmpName:" + empName);

    }

    public BasicsEx5(){
        //this(1,"Joe");
        System.out.println("In Default Constructor");
    }

    public void display(){
        System.out.println("EmpId:" + empId + " " + "EmpName:" + empName);
    }

};
    class Main{

    static public void main(String...a) {
        BasicsEx5 obj = new BasicsEx5(1,"AG");
       // BasicsEx5 obj2 = new BasicsEx5(2,"XY");
        //obj.display();
       // obj2.display();

        //BasicsEx5 obj3 = new BasicsEx5();
        obj.empName="IJK";
        obj.empId=20;
        obj.display();



    }
}
