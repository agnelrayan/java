package com.expertzlab.arrays;

public class MainClass
{
    public static void main(String args[])
    {
        System.out.println("Hello, World!");
        //step1 : first create array of 10 elements that holds object addresses.
        Emp[] employees = new Emp[5];
        //step2 : now create objects in a loop.
        for(int i=0; i<employees.length; i++){
            employees[i] = new Emp(i+1);//this will call constructor.
        }
    }
}

class Employ{
    int eno;
    public Employ(int no){
        eno = no;
        System.out.println("emp constructor called..eno is.."+eno);
    }
}
