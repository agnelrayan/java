package com.expertzlab.Basics;

/**
 * Created by geo on 29/7/17.
 */

class SuperTest{
      void display(){
        System.out.println("Diplay method in SuperTest");
    }
}


class Test2 extends  SuperTest{
    void display3() {
        System.out.println("Display method3--Test2");
    }
}

class Test3 extends Test2{
    void display4(){
        System.out.println("Display method Display4-Test3");
    }
}


public class OverrideTest {

public static void main(String[] args) {

    SuperTest obj = new SuperTest();
    obj.display();

    Test2 obj2 = new Test2();
    obj2.display3();
    //obj2.display3();
    Test2 obj3 = new Test2();
    obj3.display3();
    obj3.display();

    Test3 obj4 = new Test3();
    obj4.display();
    obj4.display3();


}
}
