package com.expertzlab.sample3;

/**
 * Created by agnel on 5/8/18.
 */
public class Account {
    String accNo;
    String accType;
    float balance;

    public Account(String no,String type,float bal){

        accNo=no;
        accType=type;
        balance=bal;

            }

    public void display(){
        System.out.println("Account No:"+accNo);
        System.out.println("Account Type:"+accType);
        System.out.println("Balance:"+balance);
    }

    /*
    public void display(Account ac){
        System.out.println("Account No:"+ac.accNo);
        System.out.println("Account Type:"+ac.accType);
        System.out.println("Balance:"+ac.balance);

    }*/
}
