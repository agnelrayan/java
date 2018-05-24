package com.expertzlab.thiskeyword;

/**
 * Created by geo on 25/9/17.
 */
public class ThisEx2 {

    public void display(){

        System.out.println("In Display Method");
    }

    public void display2(){
        //this.display();
        display();
        System.out.println("In Display Method2--");
    }
    public static void main(String[] args) {
        ThisEx2 obj = new ThisEx2();
        obj.display2();
    }
}
