package com.expertzlab.sample3.test;

/**
 * Created by agnel on 5/15/18.
 */
class PrivateEx {
    private int id=10;
    private String name="Ag";
    private void display(){
        System.out.println("IN private Method....");
    }
    public static void main(String[] args) {
        PrivateEx obj = new PrivateEx();
        System.out.println(obj.id);
        System.out.println(obj.name);
        obj.display();
    }
}
