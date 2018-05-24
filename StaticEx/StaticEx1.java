package com.expertzlab.StaticEx;

public class StaticEx1 {

    int id;
    String name;
    static String college="SXC";

    public StaticEx1(int id,String name){
        this.id=id;
        this.name=name;
    }
    public static void changeStatic(){
        college="SJC";
    }
    public void display(){
        System.out.println(id+" "+name+" "+college);
    }

    public static void main(String[] args) {
        StaticEx1 obj = new StaticEx1(1,"AA");
        StaticEx1 obj2 = new StaticEx1(2,"BBB");
        changeStatic();
        obj.display();
        obj2.display();
    }

}
