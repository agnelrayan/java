package com.expertzlab.Basics;

public class EmployTest {
    public static void main(String[] args) {
        Employ obj = new Employ(1);
        obj.setDesignation("Manager");
        //obj.getDesignation();
        obj.setName("Ag");
        obj.setSalary(3000);
        obj.print();

        Employ obj2 = new Employ(2);
        obj2.setName("XY");
        obj2.setDesignation("Developer");
        obj2.setSalary(5000);
        obj2.print();
    }
}
