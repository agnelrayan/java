package com.expertzlab.Basics;


public class BasicEx6 {
    int id;
    String name;
    void insert(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("Id:"+id+"Name:"+name);
    }

    public static void main(String[] args) {
        BasicEx6 obj = new BasicEx6();
        BasicEx6 obj2 = new BasicEx6();
        obj.insert(10,"AG");
        obj2.insert(20,"Ray");
        obj.display();
        obj2.display();
    }
}
