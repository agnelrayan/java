package com.expertzlab.sample3.test.test2;

/**
 * Created by agnel on 5/17/18.
 */
class Account {

    String accno;
    String accType;
    int balance;

}
class Bank{

    public static void main(String[] args){

        Account ac1 = new Account();
        Account ac2 = new Account();
        ac1.accno = "12345";
        ac1.accType = "savings";
        ac1.balance = 20000;

        System.out.println("acc1 account:" + ac1.accno);
        System.out.println("acc1 accType:" + ac1.accType);
        System.out.println("acc1 balance:" + ac1.balance);
    }


}
