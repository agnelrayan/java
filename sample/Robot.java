package com.expertzlab.sample;

/**
 * Created by agnel on 5/5/18.
 */
public class Robot {
    String name;

    public Robot(String name){
        this.name=name;
            }

            public void walk(int x) throws InterruptedException {

        for(int i=0;i<=x;i++){
            System.out.println(name+"step:"+i);
            Thread.sleep(2000);

        }

            }
}
