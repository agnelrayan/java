package mypack;

/**
 * Created by agnel on 6/1/18.
 */
public class Employee {
    private int empId;
    private String empName;
    private float empSalary;

    public Employee(int empId,String empName,float empSalary){
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;

    }

    protected void display(){
        System.out.println("EmpId:"+empId);
        System.out.println("EmpName:"+empName);
        System.out.println("EmpSalary:"+empSalary);
    }
}
