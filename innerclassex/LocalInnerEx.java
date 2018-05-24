package com.expertzlab.innerclassex;

/**
 * Created by geo on 27/9/17.
 */

class LocalInOuter{
    private int data=20;
    void methodInner(){
        System.out.println("In Method Inner Body");
        System.out.println(data);
        class LocalInner{
            private String name="Ray";
            public void methodLocalInner(){
            //    data=40;
                System.out.println("Inside Local Inner Method");
                System.out.println(data);
                System.out.println(name);
            }

        }
        LocalInner obj = new LocalInner();
        obj.methodLocalInner();
    }
}

public class LocalInnerEx {
    public static void main(String[] args) {
        LocalInOuter obj2 = new LocalInOuter();
        obj2.methodInner();
    }
}
