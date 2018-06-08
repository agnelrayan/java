package com.expertzlab.Strings;

class Emp3{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp3)) return false;

        Emp3 emp3 = (Emp3) o;

        return id == emp3.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    int id;
    public Emp3(int id){
        this.id=id;

    }

}
public class TestEmp3 {
    public static void main(String[] args) {
        Emp3 obj = new Emp3(23);
        Emp3 obj2 = new Emp3(23);

        System.out.println(obj.equals(obj2));
       // System.out.println(obj==obj2);
    }
}
