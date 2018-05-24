package com.expertzlab.Collections.HashcodeEqualsMethodEx;

/**
 * Created by agnel on 5/22/18.
 */
public class Student {
    int id;
    String name;


    public Student(int id,String name){

        this.id=id;
        this.name=name;

    }

    public boolean equals(Object obj){

        if(this==obj)
            return true;

        if(obj==null|| obj.getClass()!=this.getClass())
            return false;

        Student ob =(Student)obj;

        return (ob.id==this.id);



    }

    public int hashCode(){
        return this.id;

    }

    public static void main(String[] args) {

        Student st1 = new Student(10,"AG");
        Student st2 = new Student(10,"A");
        System.out.println(st1.equals(st2));

    }
}
