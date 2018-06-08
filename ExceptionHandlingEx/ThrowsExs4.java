package com.expertzlab.ExceptionHandlingEx;

/**
 * Created by agnel on 6/8/18.
 */
public class ThrowsExs4 {
    public static int sum(int a,int b){
        if(a<=0)
            throw new ArithmeticException("Pls provide valid nos.");
        else {
            System.out.println("Yes Valid Numbers");
          //  return a + b;
            //System.out.println("Sum is:"+c);
        }
        return a+b;

    }
    public static void main(String[] args) {
        int r=sum(1,10);
        System.out.println("Result is:"+r);
    }
}
