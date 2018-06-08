package com.expertzlab.sample2.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by agnel on 5/17/18.
 */
public class StudentM {
    public static void main(String[] args) {
        Student obj = new Student(10,"AG");
        Student obj2 = new Student(20,"Ray");


        ArrayList<Student> al = new ArrayList<Student>(10);
        System.out.println(al.size());
        al.add(obj);
        al.add(obj2);

       // System.out.println(al.ensureCapacity(10));

        System.out.println(al.size());

        Iterator itr = al.iterator();
        while(itr.hasNext()){

            Student st =(Student)itr.next();

            System.out.println("Id:"+st.id+"Name:"+st.name);
        }

        al.add(new Student(30,"Raj"));

        for(Student ob: al){
            System.out.println("Id:"+ob.id+"Name:"+ob.name);
        }

        al.remove(obj);

        for(Student ob: al){
            System.out.println("Id:"+ob.id+"Name:"+ob.name);
        }
    }
}
