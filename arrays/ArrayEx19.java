package com.expertzlab.arrays;


public class ArrayEx19 {
    int id;
    String name;
    int age;

    public ArrayEx19(int id,String name,int age){
        this.id=id;
        this.name=name;
        System.out.println("Id:"+id+","+"Name:"+name+","+"Age:"+age);
    }

    public static void main(String[] args) {
        ArrayEx19[] obj = new ArrayEx19[3];
      //  Student[] obj2 = new Student[3];
        obj[0]=new ArrayEx19(10,"Ag",20);
        obj[1]=new ArrayEx19(20,"AB",22);
        obj[2] =new ArrayEx19(30,"XY",23);

    }
}
