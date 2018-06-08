package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;

/**
 * Created by Agnel on 16/10/17.
 */
public class ArrayListEx12 {
    public static void main(String[] args) {
        ArrayListEx11 obj1 = new ArrayListEx11(1,"AG");
        ArrayListEx11 obj3 = new ArrayListEx11(3,"Anto");
        ArrayListEx11 obj2 = new ArrayListEx11(2,"Ray");

        ArrayList<ArrayListEx11> al = new ArrayList();
        al.add(obj1);
        al.add(obj3);
        al.add(obj2);

        //System.out.println(al);

     /*   Iterator itr = al.iterator();

        while(itr.hasNext()){
            //System.out.println(itr.next());
            ArrayListEx11 obj = (ArrayListEx11)itr.next();
            System.out.println("Id:"+obj.employeeId+" "+"Name:"+obj.employeeName);*/
       // Collections.sort(al);
        for(ArrayListEx11 obj:al){
            System.out.println("Employee Id:"+obj.employeeId+" "+"Employee Name:"+obj.employeeName);

        }
        //Collections.sort(al);

    }
}
