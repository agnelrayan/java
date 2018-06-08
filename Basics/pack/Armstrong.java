package com.expertzlab.Basics.pack;

/**
 * Created by agnel on 5/4/18.
 */
public class Armstrong {
    public static void main(String[] args) {
        int n=121;
        int temp=n;
        int a=0;
      //  int c=0;
        int sum=0;
        while(n>0){

            a=n%10;
            n=n/10;
            sum = sum+(a*a*a);

          //  System.out.println("Sum:"+sum);
        }
        System.out.println("Sum:"+sum);
        if(temp==sum)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not Armstrong");
    }
}
