package com.expertzlab.sample3.test.test2;

/**
 * Created by agnel on 5/21/18.
 */
public class RecursiveEx {
    static int i=0;
    public static void display(){
        //int i=0;
        i++;

        for(;i<5;){
            System.out.println("In Display Method..."+i);
            display();
        }

    }

    public static void main(String[] args) {
        display();
    }
}
