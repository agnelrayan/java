package com.expertzlab.sample2.fileex;

/**
 * Created by agnel on 5/15/18.
 */
public class Student {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    int id;
    String name;


      public Student(int id,String name){
        this.id=id;
        this.name=name;

    }

    public void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
    public static void main(String[] args) {
        Student obj = new Student(10,"AG");
        Student obj2 = new Student(10,"AB");
        System.out.println(obj.equals(obj2));//true
    }

}
