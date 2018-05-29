package com.expertzlab.interfaceEx;

/**
 * Created by agnel on 5/29/18.
 */
public class Manonymous {
    public static void main(String[] args) {
        AnonymousEx2 a = new AnonymousEx2(){
            public void message(){
                System.out.println("IN Message Definition...");
            }
        };
        a.message();
    }
}
