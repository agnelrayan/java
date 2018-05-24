package com.expertzlab.Collections.HashSetSample;

/**
 * Created by geo on 5/1/18.
 */
public class Employee {
    int id;
    String name;
    public Employee(int id,String name){
        this.id=id;
        this.name=name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }













}
