package com.expertzlab.Collections.comparableex;


import java.util.ArrayList;
import java.util.Collections;

public class MainEx {
    public static void main(String[] args) {
        ArrayList<Student> li = new ArrayList<Student>();
        li.add(new Student(1,"AG",25));
        li.add(new Student(4,"AG",24));
        li.add(new Student(3,"AG",27));
        Collections.sort(li);

        for(Student obj:li){
            System.out.println(obj.id+","+obj.name+","+obj.age);
        }
    }
}
