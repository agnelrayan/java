package com.expertzlab.sample3;

/**
 * Created by agnel on 5/10/18.
 */
public class ArrayEx {
    public static void main(String[] args) {
        int a[] ={10,20,30,40,50};
        int sum=0;
        int i;
        for(i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+(sum/a.length));

        int b[] ={10,30,40};
        for(int j:b)
            System.out.println(j);

    }
}
