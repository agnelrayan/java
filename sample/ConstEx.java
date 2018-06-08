package com.expertzlab.sample;

/**
 * Created by agnel on 5/5/18.
 */
public class ConstEx {
    int id;
    String name;

    public ConstEx(){
        System.out.println("IN Default Constructor");
    }
    public ConstEx(int id,String name){
        this();
        this.id=id;
        this.name=name;
        System.out.println("Id:"+id+"Name:"+name);

    }
    void display(){
        System.out.println("In Display Method..");
    }

    public static void main(String[] args) {

        ConstEx obj = new ConstEx(10,"AG");
        ConstEx obj2 = new ConstEx(20,"AB");
       // ConstEx obj3 = new ConstEx();
        obj2.display();

    }
}
