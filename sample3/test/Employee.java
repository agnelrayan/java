package com.expertzlab.sample3.test;

/**
 * Created by agnel on 5/31/18.
 */
public class Employee {
    int id;
    String name;
    String address;

    public Employee(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;

    }

    public void display(Employee obj){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);

    }

}
