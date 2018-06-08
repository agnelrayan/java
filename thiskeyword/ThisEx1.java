package com.expertzlab.thiskeyword;

/**
 * Created by geo on 25/9/17.
 */
public class ThisEx1 {
    int id;
    String name;
    float fee;

    public ThisEx1(int idd,String namee,float feee){
        this.id=id;
        this.name=name;
        this.fee=fee;
    }
    public void display(){
        System.out.println("Id:"+id+ " "+"Name: " +name+"Fee : "+fee);
    }

    public static void main(String[] args) {
        ThisEx1 obj = new ThisEx1(10,"ABC",90);
    //    ThisEx1 obj2 = new ThisEx1(20,"XYZ",80f);
        obj.display();
     //   obj2.display();
    }
}
