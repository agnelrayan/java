package com.expertzlab.Collections.HashSetSample;

import java.util.HashSet;

public class TestEmp {
    public static void main(String[] args)
    {
       /* Emp emp1 = new Emp(23);
        Emp emp2 = new Emp(23);
        System.out.println("emp1.equals(emp2)--->>>"+emp1.equals(emp2));*/


        Emp emp1 = new Emp(23);
        Emp emp2 = new Emp(24);
        Emp emp3 = new Emp(25);
        Emp emp4 = new Emp(26);
        Emp emp5 = new Emp(27);
        Emp emp6 =new Emp(27);
        System.out.println("emp5:"+emp5.hashCode());
        System.out.println("emp6:"+emp6.hashCode());

        HashSet<Emp> hs = new HashSet<Emp>();
        hs.add(emp1);
        hs.add(emp2);
        hs.add(emp3);
        hs.add(emp4);
        hs.add(emp5);
        hs.add(emp6);

        System.out.println("Iterate the elements");
        for(Emp emp:hs){
            System.out.println("Age of the Employee:"+emp.age);
        }

        /*System.out.println("HashSet Size--->>>"+hs.size());
        System.out.println("hs.contains( new Emp(25))--->>>"+hs.contains(new Emp(25)));
        System.out.println("hs.remove( new Emp(24)--->>>"+hs.remove( new Emp(24)));
        System.out.println("Now HashSet Size--->>>"+hs.size());*/
    }
    }

