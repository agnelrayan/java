package com.expertzlab.Collections.ArrayListSamples;


import java.util.ArrayList;
import java.util.Iterator;

public class StudentMain {
    public static void main(String[] args) {
        StudentList obj1 = new StudentList(1,"AG",90,70,80);
        StudentList obj2 = new StudentList(2,"Ray",90,60,70);
        ArrayList<StudentList> al=new ArrayList();
        al.add(obj1);
        al.add(obj2);
        al.add(new StudentList(3,"Joe",80,90,78));
        al.add(new StudentList(5,"Jose",67,80,90));

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            StudentList sl = (StudentList)itr.next();
            System.out.println("Id:"+sl.id+" "+"Name:"+sl.name);
        }

        System.out.println("Using for each loop:");
        for(StudentList list:al){
            System.out.println("Id:"+list.id+"Name:"+list.name);
        }
    }
}
