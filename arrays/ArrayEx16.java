package com.expertzlab.arrays;

import java.util.Scanner;

public class ArrayEx16 {
    int id;
    String name;
    int salary;

   /* public ArrayEx16(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

        //System.out.println("Id:"+id+" " +"Name:"+name);

    }*/

    public void getData(){


        //System.out.print("\n\tEnter Employee Id : ");
        //Id = Integer.parseInt(sc.nextLine());

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Id");
        id = Integer.parseInt(obj.nextLine());

        System.out.println("Enter the Name");
        name = obj.nextLine();

        System.out.println("Enter the salary");
        salary = Integer.parseInt(obj.nextLine());

    }

    public void display(){

            System.out.println("Id is:" + id);
            System.out.println("Name is:" + name);
            System.out.println("Salary is:" + salary);

        }

    public static void main(String[] args) {

        ArrayEx16 obj[] = new ArrayEx16[4];
        //obj[0] =new ArrayEx16(1,"AG");
        //obj[1] = new ArrayEx16(2,"AB");
        //obj[0].getData();
        //obj[0].display();

        System.out.println("Enter the Employee details:");
        Scanner obj2 = new Scanner(System.in);
        int n=obj2.nextInt();

        for(int i=0;i<n;i++)
            obj[i] =  new ArrayEx16();   // Allocating memory to each object


        for(int i=0;i<n;i++){
            System.out.println("Enter the Details of Employees:");
            obj[i].getData();
        }

        System.out.println("Details of Employees:");
         for(int i=0;i<n;i++){
            //System.out.println("Details of Employee");
            obj[i].display();
        }


    }
}
