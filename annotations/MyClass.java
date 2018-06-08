package com.expertzlab.annotations;

import java.io.IOException;

/**
 * Created by agnel on 6/1/18.
 */

@Deprecated
public class MyClass {

    @SuppressWarnings("unchecked")
    public void myMethod1(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void myMethod2(){

    }

}
