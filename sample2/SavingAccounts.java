package com.expertzlab.sample2;

import com.expertzlab.Basics.pack.SavingsAccounts;

import java.io.IOException;

/**
 * Created by agnel on 5/7/18.
 */
public class SavingAccounts extends Accounts {
    SavingAccounts(int amount) {
        super(amount);
    }

    public void display(){
        System.out.println("SAving Accounts");
    }

    public int getAmount(){

        return amount;
    }
  /*  Accounts printAccType() {
        System.out.println("Saving Account");
        return new Accounts(300);
    }*/
}
