package com.expertzlab.sample2;

/**
 * Created by agnel on 5/6/18.
 */
public class PrimeTwo {
    public static void main(String[] args) {
        boolean flag=true;
        int m=0;
        int n=172;
        for(int i=2;i<=n/2;i++){
            m=n%i;
            if(m==0){
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("Is Prime");
        else
            System.out.println("Not Prime");
    }
}
