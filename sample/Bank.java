package com.expertzlab.sample;

import com.expertzlab.sample2.Account;

/**
 * Created by agnel on 5/5/18.
 */
public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account("1","Personal",10000);
        Account acc2 = new Account("2","Salary",20000);
        acc1.display();
        acc2.display();

       // int i=acc1.getMinBalance();
      //  System.out.println("Minimum Balance:"+i);
        /*acc1.accountNo="1";
        acc1.accountType="Personal";
        acc1.balance=10000;
        System.out.println("Account No:"+acc1.accountNo);
        System.out.println("Account Type:"+acc1.accountType);
        System.out.println("Balance:"+acc1.balance);*/


    }
}
