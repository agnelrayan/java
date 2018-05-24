package com.expertzlab.sample2;

import java.io.IOException;

/**
 * Created by agnel on 5/7/18.
 */
public class Accounts {

    int amount=0;

    Accounts(int amount){
        this.amount=amount;

    }

    public void display(){
        System.out.println("Accounts....");
    }

    public int getAmount(){
        return amount;
    }
   /* Accounts printAccType() throws ArrayIndexOutOfBoundsException{
        return new Accounts(1000);
    }*/
}
