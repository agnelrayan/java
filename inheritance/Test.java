package com.expertzlab.inheritance;


public class Test {
    int id;
    String name;

    void display(){
        System.out.println(id);
        System.out.println(name);
    }

}
class Test2 extends Test{
    protected void display(){
        System.out.println(id);
        System.out.println("In derived class");
    }
    public static void main(String[] args) {
        Test obj = new Test2();
        obj.id=10;
        obj.name="AG";
        obj.display();

    }
}
