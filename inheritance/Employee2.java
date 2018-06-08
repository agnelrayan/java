package com.expertzlab.inheritance;

class Department{
    int did;
    String dname;
}
class Staff extends Department{
    int sid;
    String sname;
    void deptDisplay(){
        System.out.println(did);
        System.out.println(dname);
    }

}
public class Employee2 extends Staff {
    void display(){
        System.out.println(did);
        System.out.println(dname);
    }
    void staffDisplay(){
        System.out.println(sid);
        System.out.println(sname);
    }
    public static void main(String[] args) {
        Employee2 obj = new Employee2();
        obj.did=10;
        obj.dname="Ag";
        obj.display();
        obj.sid=20;
        obj.sname="Joe";
        obj.staffDisplay();
        obj.deptDisplay();

    }

}
