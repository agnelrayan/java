package com.expertzlab.sample3;

/**
 * Created by agnel on 5/7/18.
 */
public class Student {
    int id;
    String name;

    void display(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.id=10;
        st.name="Ag";
        st.display();

        Student st2 = new Student();
        st2.id=20;
        st2.name="AB";
        st2.display();

    }
}
