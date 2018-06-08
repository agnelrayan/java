package com.expertzlab.sample3.test;

/**
 * Created by agnel on 5/15/18.
 */
public class PrivateEx2 {
    private int id=10;
    private String name="Ag";

    public void display(){
        System.out.println("IN Display---private...");
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);

    }

}

class PrivateMain{
    public static void main(String[] args) {
        PrivateEx2 obj = new PrivateEx2();
         obj.display();
    }
}
