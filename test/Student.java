package com.expertzlab.test;

/**
 * Created by agnel on 3/22/18.
 */
public class Student {

    int id;
    String name;

    public Student(){
        this(10,"XY");
        System.out.println("Default Constructor...");
    }

    public Student(int id,String name){
       // this();
        this.id=id;
        this.name=name;
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);

    }

    void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }

    public static void main(String[] args) {

       // Student obj = new Student(10,"AB");
        //Student obj2 = new Student(20,"AC");
        Student obj3 = new Student();
       // obj.display();
    }
}
