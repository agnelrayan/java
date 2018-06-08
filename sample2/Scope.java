package com.expertzlab.sample2;

/**
 * Created by agnel on 5/11/18.
 */
public class Scope {
    protected int i=5;
    public static void main(String[] args) {

        Scope s = new Scope();
       // s.printIvalue();
        ExtScope es = new ExtScope();
        //es.printIvalue();
        s=es;
        s.printIvalue();
        s.getI();
        System.out.println("i="+s.i);
        System.out.println("i="+es.i);



    }

    public int getI(){
        return i;

    }

    void printIvalue(){
        for(int i=0;i<5;i++){
            System.out.println("Parent class...i=" +i);

        }
        System.out.println("After i:"+i);

    }

}


class ExtScope extends Scope{
    int i=100;
    public int getI(){
        return i;

    }
    void printIvalue(){
        for(int i=0;i<10;i++){
            System.out.println("Child class..i=" +i);

        }
        System.out.println("After Ext. i:"+i);

    }

}
