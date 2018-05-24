package com.expertzlab.Basics;

public class PrimeTest {

    public static void main(String[] args) {

        int num = 20;
       // boolean flag = false;
        boolean temp = false;


        for(int i = 2; i <= num/2; ++i)

        {
            //System.out.println(num);
            // condition for nonprime number
            if(num % i == 0)
            {
         //       System.out.println(num);
                temp = true;
                break;
            }
        }

        if (!temp) {
            System.out.println(num + " is a prime number.");
            System.out.println("Temp value:" +temp);
        }
        else{
            System.out.println(num + " is not a prime number.");
          //  System.out.println("Temp value is:"+temp);
        }

    }
}