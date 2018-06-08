package com.expertzlab.ExceptionHandlingEx;
class ExceptionExample{
    void method()throws ArithmeticException{
        throw new ArithmeticException("ArithmeticException Occurred");
    }
}
class ThrowsEx7{
    public static void main(String args[])throws ArithmeticException{
        ExceptionExample obj=new ExceptionExample();
        obj.method();

        System.out.println("End Of Program");
    }
}
