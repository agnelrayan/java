package com.expertzlab.arrays;

import java.util.Scanner;


public class ArrayEx3 {
    int id;
    String name;

    public void getData(){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the name");
        name=obj.nextLine();

        System.out.println("Enter the Id");
        id=obj.nextInt();

    }

    public void putData(){
        System.out.println("Id:"+id+", "+"Name:"+name);
    }

    public static void main(String[] args) {

        ArrayEx3 obj[] = new ArrayEx3[3];
        for(int i=0;i<obj.length;i++){

            obj[i]= new ArrayEx3();
            obj[i].getData();
           // obj[i].putData();
        }
        for(int i=0;i<obj.length;i++){
            obj[i].putData();
        }
    }
}
