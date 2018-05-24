package com.expertzlab.ExceptionHandlingEx;


class TestExceptionPropagation1{
    void m(){
        int data=50/0;
    }
    void n(){
       // m();
        try{
            m();
        }catch(Exception e){System.out.println("exception handled by n() method");}

    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        TestExceptionPropagation1 obj=new TestExceptionPropagation1();
        obj.p();
        System.out.println("normal flow...");
    }
}
