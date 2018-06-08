package com.expertzlab.Basics;


public class AnonObjEx {
    public void fact(int n) {
        int f=1;
        for (int i = 1; i <= n; i++) {
             f = f*i;
            //return f;
        }
        System.out.println("The value of fact is:"+f);
        //return f;
    }

    public static void main(String[] args) {
        //fact(5);
        new AnonObjEx().fact(5);//calling method with anonymous object

        AnonObjEx r1=new AnonObjEx(),r2=new AnonObjEx();//creating two objects
        r1.fact(4);
        r2.fact(3);
    }
}
