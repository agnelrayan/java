package com.expertzlab.arrays;
public class ArrayEx
{
    public static void main(String args[])
    {
        System.out.println("Hello, World!");
        //step1 : first create array of 10 elements that holds object addresses.
        Emp[] employees = new Emp[2];
        //step2 : now create objects in a loop.
        for(int i=0; i<employees.length; i++){
            employees[i] = new Emp(i+1);//this will call constructor.
        }
    }
}

class Emp{
    int eno;
   // String name;
    public Emp(int eno){
        this.eno = eno;
        //this.name=name;

        System.out.println("emp constructor called..eno is.."+eno);
    }
}
