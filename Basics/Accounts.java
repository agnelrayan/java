package com.expertzlab.Basics;

/**
 * Created by agnel on 5/3/18.
 */

public class Accounts {
    final static float minBalance=1000;
    float curBalance;

    public Accounts(float curBalance){
        this.curBalance=curBalance;

    }
    public void debit(float amount){
        curBalance=curBalance-amount;
        System.out.println("Current Balance:"+curBalance);

    }

    public void credit(float amount){
        curBalance=curBalance+amount;
        System.out.println("Current Balance:"+curBalance);
    }

    public float getBalance(){
        return curBalance;
    }


}
