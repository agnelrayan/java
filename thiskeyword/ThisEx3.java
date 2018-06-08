package com.expertzlab.thiskeyword;

/**
 * Created by geo on 25/9/17.
 */
public class ThisEx3 {
    int id;
    String name;
    public ThisEx3() {

        //this(10,"AG");
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("IN Default Constructor");
        }
    }
        public ThisEx3(int id,String name){

          // this();
           this.id=id;
            this.name=name;
            System.out.println("Id:" +" "+ "Name:"+name);

        }



    public static void main(String[] args) {


        ThisEx3 obj = new ThisEx3(100,"ABC");
        //ThisEx3 obj = new ThisEx3();


    }
}
