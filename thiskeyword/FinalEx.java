package com.expertzlab.thiskeyword;

class FinalParent{
   // final int ID;
   // final int STUD_ID;
    static final String COLLEGE_NAME;
    static final String COLLEGE_ADDRESS;
    String dept_name;
    float marks;
    public FinalParent(){
       // STUD_ID=1;
        System.out.println("IN Parent class Constructor");
    }

   /* {
        ID=30;
        marks=95;
    }*/
  // instance initializer block
    {dept_name="CSC";
        System.out.println("Department Name:"+dept_name);}

    //static initializer block
    static {COLLEGE_NAME="SJC";
        System.out.println("College Name:"+COLLEGE_NAME);}

    static{
        System.out.println("Static initializer block2");
    }

    static {
        COLLEGE_ADDRESS = "Cochin";
    }

    {
        System.out.println("IN Instance Initializer block2...");
    }
    final void display(){
        //id=20;
      //  System.out.println("ID from Final method:"+ID);
    }
}
public class FinalEx extends FinalParent {
    public FinalEx(){
        System.out.println("Child class constructor...");
    }
   public void display2(){
        System.out.println("IN Child");
    }
    {
        System.out.println("Instance Initializer in child class");
    }
    static{
        System.out.println("Static Initializer block in Child class");
    }
    public static void main(String[] args) {

        //FinalEx obj = new FinalEx();
        //obj.display();
        //obj.display2();

        //FinalEx obj2 = new FinalEx();

        final FinalEx obj3 = new FinalEx();
        String str=obj3.dept_name="IT";
        System.out.println("Department Name is:"+str);

        final int a=10;
        System.out.println("A:"+a);

        System.out.println(COLLEGE_ADDRESS);

        final StringBuilder str2 = new StringBuilder("Ag");
        System.out.println(str2);
        final String str3="Rayan";
        final String str4=str3+str2;
        System.out.println("String4:"+str4);
        System.out.println("String2:"+str2);
        str2.append("Rayan");
        System.out.println("String2:"+str2);

        final StringBuffer str5 = new StringBuffer("ABC");
        /* changing internal state of object
         reference by final reference variable sb*/
        str5.append("DEF");
        System.out.println("String5:"+str5);

       /* final String str6 = new String("IJK");
        str6.append("LMN");
        System.out.println("String5:"+str6);*/

        final int i;// local final variable
        i=20;
        System.out.println("I:"+i);

        int arr[] = {1, 2, 3};

        /* final with for-each statement
         legal statement*/
        for (final int j : arr)
            System.out.print(j + " ");



    }
}
