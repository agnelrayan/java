package com.expertzlab.annotations;

/**
 * Created by agnel on 4/12/18.
 */
public class Demo2 {

    @Deprecated
    public static void msg(){
        System.out.println("In Static...");

    }
    @Deprecated
    public void showDeprecatedmsg(){
        System.out.println("This is deprecated msg...");
    }
    //@SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        obj.showDeprecatedmsg();
        msg();

    }
}
