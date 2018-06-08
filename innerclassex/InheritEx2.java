package com.expertzlab.innerclassex;

/**
 * Created by agnel on 4/6/18.
 */

class Employee{
    int salary=10000;
}

class Programmer extends Employee{
    int bonus=1000;
}

public class InheritEx2 {
    public static void main(String[] args) {

        Programmer obj = new Programmer();
        System.out.println("Bonus:"+obj.bonus);
        System.out.println("Salary:"+obj.salary);

    }
}
