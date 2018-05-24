package com.expertzlab.Basics;


public class Student {
    int id;
    String name;
    int marks;
    int age;

    Student(){

        System.out.println("In default Constructor");
    }
    public Student(int idd,String namee){
        //super();
       // this();
        id=idd;
        name=namee;
        //System.out.println();

    }
    public Student(int id,String name,int marks){
       // this(10,"AG");
        this.id=id;
        this.name=name;
        this.marks=marks;
        //System.out.println();

    }
    public Student(int id,String name,int age,int marks){
        this.id=id;
        this.name=name;
        this.age=age;
        this.marks=marks;
        //System.out.println();

    }

    void init(int id,int marks){
        this.id=id;
        this.marks=marks;
    }
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);

    }
    public static void main(String[] args) {
        Student obj = new Student(10,"Ag");
        obj.display();

        Student obj2 = new Student(20,"AB");
        obj2.display();

       // Student obj3 = new Student();
       // Student obj4 = new Student();

        Student obj5 = new Student(30,"JOe",90);
        obj5.display();

        Student obj6 = new Student(30,"JOe",24,90);
        obj6.display();

        Student obj7 = obj6;
      //  System.out.println(obj7.toString());
        obj7.display();

        Student obj8 = new Student();
        obj8.id=obj6.id;
        obj8.name=obj6.name;
        
        obj8.display();
        System.out.println("After the initial method");
        obj8.init(10,100);
        obj8.display();


    }
}
