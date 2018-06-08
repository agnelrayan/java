package com.expertzlab.inheritance;

class CalcFuntion{
    int z;
    /*Constructors are not members,
    so they are not inherited by subclasses,
    but the constructor of the superclass
    can be invoked from the subclass.
     */
    CalcFuntion(){
        System.out.println("In Super class constructor--CalcFunction");
    }
    void add(int x,int y){
        z=x+y;
        System.out.println("Addition:"+z);
    }
    void sub(int x,int y){
        z=x-y;
        System.out.println("Sub:"+z);

    }

}
public class Calc extends CalcFuntion {
    Calc(){
       // super();
        System.out.println("In Derived Class Constructor--Calc...");
    }
   // int z;
    void mul(int x,int y){
        z=x*y;
        System.out.println("Muliplication:"+z);
    }
    void div(int x,int y){
        z=x/y;
        System.out.println("Division:"+z);
    }
    public static void main(String[] args) {
        int x=20;
        int y=10;

        Calc obj = new Calc();
        obj.add(100,200);
        obj.add(x,y);
        obj.sub(x,y);
        obj.mul(x,y);
        obj.div(x,y);
        obj.add(50,50);
        obj.sub(200,100);
        obj.mul(100,1);
        obj.div(200,2);



    }
}

