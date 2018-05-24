package com.expertzlab.innerclassex;


class OuterEx{

    private int id=10;
    private String name="BCD";
    public float marks=90;
    static float fee=1000;
    public void message()
    {
        System.out.println("Welcome Outer Class Method");
        System.out.println(id);
        System.out.println(fee);
    }
    class InnerEx1{
        public int stud_id=40;
        //static int stud_name="Ray";
        public void innerMethod(){
           // message();
            System.out.println("IN Inner Class Method");
            System.out.println("Id:"+id);
            System.out.println("Name:"+name);
            System.out.println("Fee"+OuterEx.fee);
        }

        /*public static void innerStatic(){
            System.out.println("IN Inner Class Static");
        }*/




    }

}
class Outer2 extends OuterEx{
    int employee_id=20;
    String employee_name="AG";

    public void empMethod(){
        System.out.println("Employee_id:"+" "+employee_id+"Employee_Name:"+employee_name);
    }
}

public class InnerEx {
    public static void main(String[] args) {
        OuterEx obj = new OuterEx();
        OuterEx.InnerEx1 obj2 = obj.new InnerEx1();

        OuterEx.InnerEx1 obj4 =new OuterEx().new InnerEx1();
        //OuterEx.InnerEx1 obj2 = OuterEx.InnerEx1();
        obj2.innerMethod();
        //obj.message();

        Outer2 obj3 = new Outer2();
        obj3.empMethod();
        obj3.message();

        obj3.employee_id=30;
        obj3.employee_name="Joy";
        obj3.marks=100;


        obj4.innerMethod();


    }
}


