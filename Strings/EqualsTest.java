package com.expertzlab.Strings;
class Employee3
{
    private Integer id;
    private String firstname;
    private String lastName;
    private String department;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee3)) return false;

        Employee3 employee3 = (Employee3) o;

        if (getId() != null ? !getId().equals(employee3.getId()) : employee3.getId() != null) return false;
        if (getFirstname() != null ? !getFirstname().equals(employee3.getFirstname()) : employee3.getFirstname() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(employee3.getLastName()) : employee3.getLastName() != null)
            return false;
        return getDepartment() != null ? getDepartment().equals(employee3.getDepartment()) : employee3.getDepartment() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getFirstname() != null ? getFirstname().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getDepartment() != null ? getDepartment().hashCode() : 0);
        return result;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Employee3 e1 = new Employee3();
        Employee3 e2 = new Employee3();

        e1.setId(100);
        e2.setId(100);

        //Prints false in console
        System.out.println(e1.equals(e2));
    }
}
