package com.expertzlab.javatest;

/**
 * Created by agnel on 3/24/18.
 */


//static variable shared by all the Objects.

public class DemoStatic {
    int studentId;
    String studentName;

    static String collegeName="SJC";


   DemoStatic(int id,String name){
        studentId=id;
        studentName=name;

    }

    public void display(){

        System.out.println("Id:"+studentId);
        System.out.println("Name:"+studentName);
        System.out.println("College Name:"+collegeName);

    }

    public void display2(){

        System.out.println("Display2............");

    }

    public void display3(){

        System.out.println("Display3............");
        DemoStatic ob = new DemoStatic(30,"Ray");
        ob.display();
        //ob.display2();
        //ob.display3();



    }

    public static void main(String[] args) {

        DemoStatic obj = new DemoStatic(10,"Tom");
        DemoStatic obj2 = new DemoStatic(20,"JOhn");


        obj.display();
       // obj2.display();

      //  obj.display2();
         obj.display3();



    }
}
