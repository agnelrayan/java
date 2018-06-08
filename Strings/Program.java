package com.expertzlab.Strings;


import java.util.Scanner;

public class Program {
    public static void main(String args[]) throws Exception
    {
        int t,n,i,j;
        System.out.println("Enter the array Element");
        Scanner obj = new Scanner(System.in);
        n=obj.nextInt();
        System.out.println(n);

        System.out.println("Enter the array value");
        int a[] = new int[n];
        //System.out.println(a);

        //	int i;
        for(i=0;i<n;i++)
            a[i] = obj.nextInt();

        //	int j;
        for(i = 0;i<n-1;i++)
            for(j=0;j<n-1;j++)
                if(a[j]>a[j+1])
                {
                    t = a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
        //int j;*/
        for(i=0;i<n;i++)
            System.out.println(a[i]);

    }
}
