package com.expertzlab.Strings;

/**
 * Created by geo on 4/10/17.
 */
public class ToStringEx {
    int id;
    String name;

    public ToStringEx(int id,String name){
        //System.out.println(id);
       // System.out.println(name);
        this.id=id;
        this.name=name;
    }

    public String toString(){
       // System.out.println(id);
       // System.out.println(name);
        return id +" "+name;
    }


    public static void main(String[] args) {
        ToStringEx obj = new ToStringEx(10,"AG");
        ToStringEx obj2 = new ToStringEx(20,"Ray");
        System.out.println(obj);
        System.out.println(obj2);

    }
}
