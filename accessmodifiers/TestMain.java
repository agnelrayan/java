package com.expertzlab.accessmodifiers;

class AccessModifierEx {
    private int age;
   // private String name;
    public int id;
    public String name;

    public void display() {
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);

    }

   /* private AccessModifierEx(){
        System.out.println("IN default Constructor");
    }*/

}
public class TestMain{


    public static void main(String[] args) {
        AccessModifierEx obj = new AccessModifierEx();
        int i=obj.id=10;
        System.out.println(i);
        String str = obj.name="Ag";
        System.out.println(str);
    }
}
