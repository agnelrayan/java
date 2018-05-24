package com.expertzlab.thiskeyword;
public class ThisTest2 {
    int id;
    String name;
    int age;
    float salary;
    public ThisTest2(){
        this(1,"JOe",24);
        System.out.println("IN Default Constructor");
    }
    public ThisTest2(int id, String name, int age){
        //this();
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public ThisTest2(int id, String name, int age,float salary){
        //this();
        //this.id=id;
        //this.name=name;
        //this.age=age;
        this(id,name,age);
        this.salary=salary;
    }
    public void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
    }

    public void display2(){
        this.display();
        System.out.println("IN Display2");
    }

    public void display3(){
        System.out.println("Return this value:"+this);
    }
    public static void main(String[] args) {
       // ThisTest2 obj = new ThisTest2(1,"Arul",24);
        ThisTest2 obj = new ThisTest2();
        obj.display2();

        ThisTest2 obj2 = new ThisTest2(2,"Paul",35,5000);
        obj2.display();

        obj2.display3();
        System.out.println("Return Object value:"+obj2);
    }
}
