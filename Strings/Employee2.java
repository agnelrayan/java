package com.expertzlab.Strings;

public class Employee2 {

    String name;
    String mobile;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee2)) return false;

        Employee2 employee2 = (Employee2) o;

        if (name != null ? !name.equals(employee2.name) : employee2.name != null) return false;
        return mobile != null ? mobile.equals(employee2.mobile) : employee2.mobile == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        return result;
    }



    public Employee2(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }




    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Employee2 emp = new Employee2("abc", "hhh");
        Employee2 emp2 = new Employee2("abc", "hhh");
        Employee2 emp3 = new Employee2("ijk","hhh");
        System.out.println(emp.equals(emp2));
        System.out.println(emp.equals(emp3));
    }
}
