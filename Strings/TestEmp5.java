package com.expertzlab.Strings;

import java.util.HashSet;

class Emp5
{
    private int age ;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp5)) return false;

        Emp5 emp5 = (Emp5) o;

        return age == emp5.age;

    }

    @Override
    public int hashCode() {
        return age;
    }



    public Emp5( int age )
    {
        super();
        this.age = age;
    }

}
public class TestEmp5 {
    public static void main(String[] args)
    {
        Emp5 emp1 = new Emp5(23);
        Emp5 emp2 = new Emp5(24);
        Emp5 emp3 = new Emp5(25);
        Emp5 emp4 = new Emp5(26);
        Emp5 emp5 = new Emp5(27);

        HashSet<Emp5> hs = new HashSet<Emp5>();
        hs.add(emp1);
        hs.add(emp2);
        hs.add(emp3);
        hs.add(emp4);
        hs.add(emp5);

        System.out.println("HashSet Size--->>>"+hs.size());
        System.out.println("hs.contains( new Emp(25))--->>>"+hs.contains(new Emp5(25)));
        System.out.println("hs.remove( new Emp(24)--->>>"+hs.remove(new Emp5(24)));
        System.out.println("Now HashSet Size--->>>"+hs.size());
    }
}
