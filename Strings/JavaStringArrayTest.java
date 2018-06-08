package com.expertzlab.Strings;


public class JavaStringArrayTest {
    private String[] toppings = {"abc", "ijk", "xyz"};
    private String[] value={"aBc","xyz","IJK"};

    // our constructor; print out the String array here
    public JavaStringArrayTest()
    {
        // new `for` loop
        for (String s: toppings)
        {
            System.out.println(s);
        }
    }

    public void display(){
        System.out.println("STring Arrays...");
        for(String obj:value){
            System.out.println(obj);
        }
    }

    // main kicks everything off.
    // create a new instance of our class here.
    public static void main(String[] args)
    {
        JavaStringArrayTest obj =new JavaStringArrayTest();
        obj.display();
    }
}
