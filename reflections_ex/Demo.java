package com.expertzlab.reflections_ex;

/**
 * Created by agnel on 4/11/18.
 */

class Simple{

}
public class Demo {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Simple");
        System.out.println(c.getName());
    }
}
