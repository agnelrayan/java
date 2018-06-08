package com.expertzlab.sample2;

/**
 * Created by agnel on 5/7/18.
 */
public class Decimal2Binary {
    public static void main(String[] args) {
        int n=10;
        convertBinary(n);
    }

    public static void convertBinary(int n){

        int bin[] = new int[40];
        int index=0;
        while(n>0){
            bin[index++] = n%2;
            //System.out.println(bin[index++]);
            n=n/2;
        }

        for(int i=index-1;i>=0;i--)
            System.out.print(bin[i]);

    }
}
