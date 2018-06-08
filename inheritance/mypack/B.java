package com.expertzlab.inheritance.mypack;

import com.expertzlab.inheritance.pack.A;

/**
 * Created by geo on 24/9/17.
 */
public class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.message();//compile time error
    }
}
