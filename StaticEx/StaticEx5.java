package com.expertzlab.StaticEx;

/**
 * Created by agnel on 5/23/18.
 */
public class StaticEx5 {
     static String name="AG";
    int id=10;

    //instance method, so you can access instance and static variable
    public void display(){
        name="Ray";
        message();
        System.out.println("In display Method..");
        System.out.println(id);
        System.out.println(name);
    }

//allow only static variable and static methods.
    public static void message(){

        name="Ab";
        System.out.println("Name:"+name);
       // System.out.println(id);

        //display();

    }

    public static void main(String[] args) {
        StaticEx5 obj = new StaticEx5();
        obj.display();
        obj.message();
        message();
        StaticEx5.message();
    }
}
