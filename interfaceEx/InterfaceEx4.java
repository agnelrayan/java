package com.expertzlab.interfaceEx;

interface IntEx1{
    interface IntInner{
        void message();
    }
}

public class InterfaceEx4 implements IntEx1.IntInner {
    public void message(){
        System.out.println("In Inner Message");
    }
    public static void main(String[] args) {
        InterfaceEx4 obj = new InterfaceEx4();
        obj.message();

    }
}
