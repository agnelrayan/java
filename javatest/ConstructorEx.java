package com.expertzlab.javatest;

/**
 * Created by agnel on 3/26/18.
 */
public class ConstructorEx {
    int id;
    String name;

    ConstructorEx(int i,String n)
    {

        id=i;
        name=n;

        // System.out.println("Id:"+id);
        //System.out.println("Name:"+name);

    }

    ConstructorEx(){
        System.out.println("Default Constructor...");
    }

    int display(){
        System.out.println("In Display...");
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        return 0;
    }



    public static void main(String[] args) {

        ConstructorEx obj = new ConstructorEx(10,"AG");
        ConstructorEx obj2 = new ConstructorEx(30,"XY");
        obj.display();
        obj2.display();

        ConstructorEx obj3 = new ConstructorEx();

    }
}
