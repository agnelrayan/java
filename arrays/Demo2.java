package com.expertzlab.arrays;


public class Demo2 {

    public static void main(String[] args) {
        int a[];
        a = new int[5];

        a[1]=10;
        a[2]=20;
        //a[6]=30;

        System.out.println("Iterating a array...");

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        int b[];
        b=a;

        System.out.println("Iterating b array ...");

        for(int i=0;i<a.length;i++){
            System.out.println(b[i]);
        }

        int arr[] = new int[]{10,20,30};
        int arr2[]={100,200,300};

        System.out.println("Iterating the Array using for Loop");

        for(int i=0;i<=2;i++){
            System.out.println(arr[i]);
        }

        System.out.println("Iterating the Array using Enhanced for Loop");

        for(Integer obj:arr2){
            System.out.println(obj);
        }

        String str[]={"Ag","AB","AC","AJ"};

        System.out.println("print string value by enhanced for loop:");
        for(String obj2:str){
            System.out.println(obj2);
        }

        char ch[]={'a','b','c'};
        System.out.println("print character value by enhanced for loop:");
        for(char obj3:ch){
            System.out.println(obj3);
        }


    }
}
