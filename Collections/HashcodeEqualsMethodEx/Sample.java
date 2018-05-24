package com.expertzlab.Collections.HashcodeEqualsMethodEx;

import java.util.ArrayList;
import java.util.HashSet;

class Emp{

    int id;


    String name;

    public Emp(int id,String name){
        this.id=id;
        this.name=name;
    }
   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp)) return false;

        Emp emp = (Emp) o;

        if (id != emp.id) return false;
        return name != null ? name.equals(emp.name) : emp.name == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
public class Sample {
    public static void main(String[] args) {
        HashSet<Emp> set = new HashSet<Emp>();
        set.add(new Emp(1,"AG"));
        set.add(new Emp(2,"Ray"));
        set.add(new Emp(1,"AG"));

        System.out.println(set);
        arrayList();


    }

    static int arrayList(){
        ArrayList<Emp> list = new ArrayList<Emp>();
        list.add(new Emp(10,"AG"));
        list.add(new Emp(20,"Ray"));
        System.out.println(list);
        return 0;
    }

}
