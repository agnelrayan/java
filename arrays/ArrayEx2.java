package com.expertzlab.arrays;

/**
 * Created by geo on 28/9/17.
 */

class Car{
    int power;
    int sno;
    String name;

    public Car(int power,int sno,String name){
        this.power=power;
        this.sno=sno;
        this.name=name;
        System.out.println("Power:"+power+","+"Sno:"+sno);
        System.out.println("Name:"+name);

    }


}
public class ArrayEx2 {
    public static void main(String[] args) {
        Car[] obj = new Car[4];
       // obj = new Car[3];
         obj[0]=new Car(10,1,"AB");
         obj[1]= new Car(20,2,"XY");
         obj[2]=new Car(30,3,"IJ");

        //int i=obj[2].sno=30;
        //int j=obj[2].power=3000;

        //System.out.println(i);
        //System.out.println(j);

    }
}
