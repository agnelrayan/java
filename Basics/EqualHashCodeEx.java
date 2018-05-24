package com.expertzlab.Basics;

import java.util.HashMap;
import java.util.Map;

public class EqualHashCodeEx {

    public static void main(String[] args) {
        Map<Employe,String> cache = loadEmp();
        Employe lood = new Employe("200","2020");
        String empName = cache.get(lood);
        System.out.println(empName);

        Map<Employe,String> cache2 = loadEmp2();
        Employe load2 = new Employe("1000","Ray");
        String empName2 = cache2.get(load2);
        System.out.println(empName2);

        Map<Department,Integer> map = loadDept();
        Department department = new Department(1,"AGnelo");
        Integer departmentId = map.get(department);
        System.out.println(departmentId);
    }
    static Map<Department,Integer> loadDept(){
        Department dk1 = new Department(1,"AGnelo");
        Department dk2 = new Department(2,"Peter");

        Map<Department,Integer> map = new HashMap<Department, Integer>();
        map.put(dk1,11);
        map.put(dk2,22);
        return map;
    }

    static Map<Employe,String> loadEmp(){
        Employe ek1 = new Employe("100","1010");
        Employe ek2 = new Employe("200","2020");
        Employe ek3 = new Employe("300","3030");

        Map<Employe, String> cache = new HashMap<Employe, String>();
        cache.put(ek1,"Ag");
        cache.put(ek2,"Ray");
        cache.put(ek3,"Joy");
        return cache;

    }

    static Map<Employe, String> loadEmp2(){

        Employe ek4 = new Employe("1000","Ray");
        Employe ek5 = new Employe("2000","AB");

        Map<Employe,String> cache2 = new HashMap<Employe, String>();
        cache2.put(ek4,"JOse");
        cache2.put(ek5,"Mike");

        return cache2;
    }
}
class Employe{

    String empId;
    String dob;
        public Employe(String empId,String dob){
            this.empId=empId;
            this.dob=dob;

        }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employe employe = (Employe) o;

        if (empId != null ? !empId.equals(employe.empId) : employe.empId != null) return false;
        return dob != null ? dob.equals(employe.dob) : employe.dob == null;

    }


    @Override
    public int hashCode() {
        int result = empId != null ? empId.hashCode() : 0;
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        return result;
    }
        }

class Department{
    int deptId;
    String deptName;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (deptId != that.deptId) return false;
        return deptName.equals(that.deptName);

    }

    @Override
    public int hashCode() {
        int result = deptId;
        result = 31 * result + deptName.hashCode();
        return result;
    }



    public Department(int deptId,String deptName){
        this.deptId=deptId;
        this.deptName=deptName;

    }

}