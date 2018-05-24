package com.expertzlab.sample;

/**
 * Created by agnel on 5/5/18.
 */
public class FinalEx {
    final static int speed=100;
    public void display(){
       // speed=200;
        System.out.println("Speed:"+speed);
    }
    public static void main(String[] args) {
        FinalEx obj = new FinalEx();
        obj.display();

    }
}
