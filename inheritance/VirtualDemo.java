package com.expertzlab.inheritance;

/* File name : Employee.java */
class Employee3 {
    private String name;
    private String address;
    private int number;

    public Employee3(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public Employee3(String name, String address) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
       // this.number = number;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress){

    address = newAddress;
}

    public int getNumber() {
        return number;
    }
}
class Salary extends Employee3 {
    private double salary; // Annual salary

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public Salary(String name, String address, double salary) {
        super(name, address);
        setSalary(salary);
    }
    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()+ " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}
public class VirtualDemo {

    public static void main(String [] args) {
        Salary s = new Salary("Ag", "Cochin", 3, 3600.00);
        Employee3 e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        Employee3 e2 = new Salary("John Adams", "Boston, MA",5000);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
        e2.mailCheck();
    }
}