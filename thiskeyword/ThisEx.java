package com.expertzlab.thiskeyword;


public class ThisEx {
    int id;
    String name;

    public ThisEx(int idd,String namee){
        //this();
        id=idd;
        name=namee;

    }

    public ThisEx(){
        this(10,"AG");
        System.out.println("Default Constructor");
    }


    void display(){
        System.out.println("Id:"+id+","+"Name:"+name);
    }

    public static void main(String[] args) {
        //ThisEx obj = new ThisEx(10,"AG");
        ThisEx obj = new ThisEx();
        obj.display();

    }
}
