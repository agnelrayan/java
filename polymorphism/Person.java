/*In dynamic polymorphism method of the program binds with an object
at runtime the advantage of dynamic polymorphism is allocating the memory space
for the method (either for overloaded method or for override method) at run time.*/
package com.expertzlab.polymorphism;
class Person
{
    void walk()
    {
        System.out.println("Can Run....");
    }
}
class Employee extends Person
{
    void walk()
    {
        System.out.println("Running Fast...");
    }
    public static void main(String arg[])
    {
        Person p=new Employee(); //upcasting
        p.walk();
    }
}