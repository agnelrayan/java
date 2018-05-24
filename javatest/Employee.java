package com.expertzlab.javatest;

/**
 * Created by agnel on 3/22/18.
 */
public class Employee {

    int id;  //instance variable
    String name;

    public Employee(int id,String name)//local variable
     {
        this.id=id;
        this.name=name;

    }

    void display(){
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Name:"+name);
    }

    //byte,short,int, long,float,double,char,boolean

    public static void main(String[] args) {

        Employee obj = new Employee(10,"AG");
        obj.display();

    }
}
