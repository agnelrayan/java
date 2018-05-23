package com.expertzlab.arrays;
class Car2{
    public int power;
    public int Serial_no;
    public Car2(int p, int s){
        power = p;
        Serial_no = s;
    }
    public void display(){
        System.out.println("Power:"+power);
        System.out.println("Serial No:"+Serial_no);
    }
}

class ArrayOfObectEx{
    public static void main(String[] args){
        Car2[] c;
        c = new Car2[10];
        c[0] = new Car2(800,111);
        c[1]= new Car2(100,1);
        c[2]=new Car2(300,30);

        c[0].display();
        c[1].display();
        c[2].display();
    }
}