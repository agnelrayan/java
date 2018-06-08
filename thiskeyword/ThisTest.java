package com.expertzlab.thiskeyword;

class ThisTestParent{
    int data=10;
    public void printData(){
        //ThisTestParent object = new ThisTestParent();
        System.out.println("The value of data"+data);

    }
}


public class ThisTest {
    int id;
    String name;
    int age;
    float salary;
    ThisTestParent obj;
    //A4 obj;

    public ThisTest(){
        this(10,"Joy");
        System.out.println("In default Constructor");
    }

    public ThisTest(int id,String name){
       // this();
         this.id=id;
         this.name=name;
        System.out.println("ID:"+id+" "+"Name:"+name);

    }
    public ThisTest(int id,String name,int age){
        this(10,"Anto");
        //this();
        this.id=id;
        this.name=name;
        this.age=age;

    }
    public ThisTest(int id,String name,int age,float salary){
        this(id,name,age);//reusing constructor
        //this();
        //this.id=id;
        //this.name=name;
        //this.age=age;
        this.salary=salary;

    }


    ThisTest(ThisTestParent obj){
        this.obj=obj;
    }
    void display7(){
        System.out.println(obj.data);//using data member of A4 class
    }


    public void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
         System.out.println("Salary:"+salary);

    }

    public void display2(){
        this.display();
        System.out.println("Display2---");
    }

    public void display3(){
        display2();
        System.out.println("Display3---");
    }


    public void display4(){
        System.out.println("Value of this:"+this);
    }
    public void display5(ThisTest obj3){
        System.out.println("Object invoked");

    }
    public void display6(){
        display5(this);
    }

    public static void main(String[] args) {
        ThisTest obj = new ThisTest(1,"AG",24);
        ThisTest obj2 = new ThisTest();
        obj.display3();
        obj.display4();
        System.out.println("Value of obj:"+obj);
        ThisTest obj3 = new ThisTest(100,"JOse",23,5000);
        obj3.display();
        obj3.display6();

    }

}
