package com.expertzlab.interfaceex.pack2;

/**
 * Created by agnel on 3/5/18.
 */
public class Student {//class name & class is starting

    int id;// states or attributes or field
    String name;//"
   // static int id=20;
    static String College_Name="SJC";

    public Student(){
        System.out.println("Default Constructor...");
    }

    public Student(int id,String name){//parameter constructor
        this.id=id;
        this.name=name;
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("College Name:"+College_Name);

    }




    void walk(){//behaviours or methods or operations
        System.out.println("In Walk Method");
    }

    void talk(){
        System.out.println("IN Talk Method...");
    }

    void eat(){
        System.out.println("In Eat Method...");
    }

   /* void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("College Name:"+College_Name);
    }*/



    public static void main(String args[]){
        Student obj4 = new Student();
        Student obj = new Student(10,"Ag");//to create object
        Student obj2 = new Student(20,"AB");
        Student obj3 = new Student(30,"AC");

        //System.out.println("Id:"+obj.id);
       // System.out.println("Name"+obj.name);
       // System.out.println(obj.id);
        //System.out.println("Colleg Name:"+College_Name);
        //System.out.println(id);

        //obj.talk();
        //obj.walk();
        //obj.eat();
      //  obj.display();
      //  obj2.display();
       // obj3.display();

    }
}
