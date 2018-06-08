package com.expertzlab.Basics.pack;

import java.lang.reflect.Constructor;

/**
 * Created by agnel on 4/11/18.
 */
public class ClassEx {
    public ClassEx(){

    }

    public ClassEx(int a,int b){

        System.out.println("a:"+a+"b:"+b);


    }

    public static void main(String[] args) {
        try{
            Class clazz= Class.forName("Constructor...");
            Class partypes[]= new Class[2];

            partypes[0] = Integer.TYPE;
            partypes[1] = Integer.TYPE;

            Constructor ct = clazz.getConstructor(partypes);
            Object arg[] = new Object[2];
            arg[0] = new Integer(37);
            arg[1]=new Integer(43);

            Object retobj = ct.newInstance(arg);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }


}
