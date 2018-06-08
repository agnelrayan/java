package com.expertzlab.sample3;


import com.expertzlab.arrays.ArrayCopy;

/**
 * Created by agnel on 5/14/18.
 */
public class ArrayMethodEx {
    public static void main(String[] args) {
        int ar[]={10,20,30,40,50};
        ArrayMethodEx ex = new ArrayMethodEx();
        ex.display(ar);
        ArrayCopy obj = new ArrayCopy();
        obj.displayArrayCopy();

    }

    public void display(int a[]){

        for(int i:a){
            System.out.println(i);
        }

    }

}
