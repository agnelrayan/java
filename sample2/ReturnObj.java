package com.expertzlab.sample2;

/**
 * Created by agnel on 5/7/18.
 */
public class ReturnObj {
    int id;
    public ReturnObj(int id){
        this.id=id;
    }
    public static void main(String[] args) {

        ReturnObj obj2 = new ReturnObj(10);
        obj2=returnMethod();
        System.out.println(obj2.id);
    }

    public static ReturnObj returnMethod(){
        ReturnObj obj = new ReturnObj(20);
        return obj;

    }

}
