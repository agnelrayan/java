package com.expertzlab.sample2;

/**
 * Created by agnel on 5/7/18.
 */
public class Freq {

    public static int freq(int a[],int n,int x){
        int count=0;
        for(int i=0;i<n;i++)
            if(a[i]==x)
                count++;
        return count;

    }

    public static void main(String[] args) {
        int a[]={5,0,5,2,3,5,3};
        int n=a.length;
        int x=3;
        System.out.println(freq(a,n,x));
    }

}
