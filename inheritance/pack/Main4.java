package com.expertzlab.inheritance.pack;

class Employee4{
    int eid;
    String ename;

    public void display(){
        System.out.println("Eid:"+eid);
        System.out.println("Ename:"+ename);
    }

}
class Department4 extends Employee4{
    int did;
    String dname;
    public void deptDisplay(){
        System.out.println("DID:"+did);
        System.out.println("DName:"+dname);
    }
}

/*class Staff2 extends Employee4,Department4{

}*/

public class Main4{
    public static void main(String[] args) {
        Department4 obj = new Department4();
        obj.eid=10;
        obj.ename="AB";
        obj.did=100;
        obj.dname="IT";
        obj.display();
        obj.deptDisplay();

        Employee4 obj2 = new Employee4();
        obj2.display();
    }
}
