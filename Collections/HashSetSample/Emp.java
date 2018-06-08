package com.expertzlab.Collections.HashSetSample;

public class Emp {

    int age;

    public Emp(int age){
        this.age=age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp)) return false;

        Emp emp = (Emp) o;

        return age == emp.age;

    }

    @Override
    public int hashCode() {
        return age;
    }




}
