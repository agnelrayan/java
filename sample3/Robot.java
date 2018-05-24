package com.expertzlab.sample3;

/**
 * Created by agnel on 5/9/18.
 */
public class Robot {
    String name;//instance variable

    //Parameter Constructor
    public Robot(String name){//local variable
        this.name=name;

    }

    public void walk(int x) throws InterruptedException {

        for(int i=0;i<x;i++){
            System.out.println(name+":Walks:"+i);
            Thread.sleep(5000);
        }


    }



}
