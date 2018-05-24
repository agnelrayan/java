package com.expertzlab.Basics;
public class Employ {
    int id;
    String name;
    String designation;
    float salary;

    public Employ(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

       public void print(){
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Designation:"+designation);
        System.out.println("Salary:"+salary);
    }





}
