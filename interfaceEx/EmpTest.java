package com.expertzlab.interfaceEx;


import java.util.Scanner;

interface Employee2{

    void getData();
    void putData();

}
class EmpClass implements Employee2{
    int id;
    String name;

public EmpClass(int id,String name){
    this.id=id;
    this.name=name;
}


    public void getData(){

        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter the Id");
        id=obj2.nextInt();
        System.out.println("Enter the Name");
        name=obj2.next();
     //   System.out.println(name);
    }
    public void putData(){
        System.out.println(id);
        System.out.println(name);
    }

}

public class EmpTest {
    public static void main(String[] args) {
       // EmpClass[] obj = new EmpClass[2];
        //Student[] studentArray = new Student[7];
        EmpClass[] obj = new EmpClass[4];
        int i;
        for(i=0;i<=obj.length;i++) {

            obj[i]=new EmpClass(1,"AG");

            obj[i].getData();
            obj[i].putData();
        }
       /* for (i=0;i<=3;i++) {
            obj.getData();
            obj.putData();
        }*/
       // obj.putData();
    }
}
