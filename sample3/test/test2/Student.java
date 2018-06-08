package com.expertzlab.sample3.test.test2;

/**
 * Created by agnel on 5/21/18.
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







    public Student(int  id, String name){
        this.id=id;
        this.name=name;

    }

}
