package com.expertzlab.thiskeyword;

/**
 * Created by agnel on 4/26/18.
 */
public class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public Student(){
        this(1,"AB",24);
        System.out.println("Default Constrctor....");
        //this(1,"AB",24);
    }

  /*  public Student(int id,String name){
        this(20,"AA",30);
        this.id=id;
        this.name=name;
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);

    }*/



    public void display()
    {
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }



    public static void main(String[] args){
        Student obj = new Student();
        //Student obj2 = new Student(20,"AB",25);
        obj.display();
        //obj2.display();

    }

}
