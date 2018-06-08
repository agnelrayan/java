package com.expertzlab.filehandling;
import java.io.*;

public class ObjectInputStreamEx{

    public static class Person implements Serializable {
        public String name = null;
        public int    age  =   0;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("agn24.txt"));

        Person person = new Person();
        person.name = "Abc";
        person.age  = 24;

      /*  Person person2 = new Person();
        person2.name="Ag";
        person.age=25;*/

        objectOutputStream.writeObject(person);
       // objectOutputStream.writeObject(person2);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("agn24.txt"));

        Person personRead = (Person) objectInputStream.readObject();

        objectInputStream.close();

        System.out.println(personRead.name);
        System.out.println(personRead.age);
    }
}