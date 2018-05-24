package com.expertzlab.Basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class ObjectCreation {
    public static void main(String... args) throws Exception {

        // By using new keyword
      /*  Employee2 emp1 = new Employee2();
        emp1.setName("Anto");

        System.out.println(emp1 + ", hashcode : " + emp1.hashCode());*/


        // By using Class class's newInstance() method
        //Employee2 emp2 = (Employee2) Class.forName("Employee2").newInstance();

        // Or we can simply do this

      /*   Employee2 emp2 = Employee2.class.newInstance();

        emp2.setName("Agnelo");

        System.out.println(emp2 + ", hashcode : " + emp2.hashCode());*/


        // By using Constructor class's newInstance() method

        Constructor<Employee2> constructor = Employee2.class.getConstructor();
        Employee2 emp3 = constructor.newInstance();
        emp3.setName("Rayan");

        System.out.println(emp3 + ", hashcode : " + emp3.hashCode());

        /*
        // By using clone() method
        Employee2 emp4 = (Employee2) emp3.clone();
        emp4.setName("Joe");

        System.out.println(emp4 + ", hashcode : " + emp4.hashCode());


        // By using Deserialization

        // Serialization
      /*  ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));

        out.writeObject(emp4);
        out.close();

        //Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
        Employee2 emp5 = (Employee2) in.readObject();
        in.close();

        emp5.setName("Baro");
        System.out.println(emp5 + ", hashcode : " + emp5.hashCode());*/

    }
}

class Employee2 implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public Employee2() {
        System.out.println("Employee Constructor Called...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee2 other = (Employee2) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee2 [name=" + name + "]";
    }

    @Override
    public Object clone() {

        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}