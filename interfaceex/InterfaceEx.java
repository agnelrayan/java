package com.expertzlab.interfaceex;
public interface InterfaceEx
{
    void sound();
    void walk();
    void speak();

}

class ClassEx implements InterfaceEx{
    public void sound(){

        System.out.println("In Sound Method");

    }
    public void walk(){

        System.out.println("In Walk Method");
    }
public void speak(){
    System.out.println("In Speak Method");

}
    public void smile(){
        System.out.println("In Smile Method");
    }
    public static void main(String[] args) {
        InterfaceEx obj = new ClassEx();
        obj.sound();
        obj.walk();
        ClassEx obj2 = new ClassEx();
        obj2.smile();
        //obj.smile();
    }



}


