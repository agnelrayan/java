package com.expertzlab.inheritance;


class SuperEx1{
    int data=40;
    public void message(){
        System.out.println("Welcome to Modifiers");
        System.out.println(data);
    }
}

public class PrivateEx1 {
    public static void main(String[] args) {
        SuperEx1 obj = new SuperEx1();
        obj.message();
        System.out.println(obj.data);//compile time error
    }
}
