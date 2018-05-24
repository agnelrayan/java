package com.expertzlab.sample2;

import com.expertzlab.Basics.pack.SavingsAccounts;

/**
 * Created by agnel on 5/7/18.
 */
public class AccountManager {
    public static void main(String[] args) throws Exception {
        Accounts ac = new SavingAccounts(1000);
        ac.display();
        //System.out.println(ac.getAmount());
        int i=ac.getAmount();
        System.out.println("Amount:"+i);

        Accounts ac2 = new CurrentAccounts(2000);
        ac2.display();


       // ac.printAccType();

       /* Accounts ac = new Accounts(1000);
        SavingAccounts sa = new SavingAccounts(2000);
        CurrentAccounts ca = new CurrentAccounts(3000);

        ac=sa;
        ac=ca;
        sa.display();
        ac.display();
        int i=sa.getAmount();
        System.out.println("Amount:"+i);*/

     /*  try {
           ok(5);
       }
       catch(RuntimeException re){
           System.out.println("Runtime Exception is caught...");

       }
       catch(Exception e){
           System.out.println("Exception...d");
       }

        System.out.println("After Ok..");

    }

    //method guards
    private static void ok(int x){
        if(x<10)
        //return ;
            throw new RuntimeException("value can not be less than 5");
    }
    */
    }
}
