package com.expertzlab.arrays;

public class Student {
    int id;
    String name;

   /* @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }*/

    public Student(int id,String name){
        this.name=name;
        this.id=id;
           }

    public static void main(String[] args) {
        /*Student[] obj;
        obj = new Student[5];*/

        Student[] obj2 = new Student[3];
        obj2[0]=new Student(1,"ABC");
        obj2[1]=new Student(2,"IJK");
        obj2[2] =new Student(3,"XYZ");

        for(Student obj:obj2)
            System.out.println("Students elements:"+obj);

        for(int i=0;i<obj2.length;i++)
            System.out.println("Id of Students:"+obj2[i].id+"Student Name:"+obj2[i].name);
    }
}
