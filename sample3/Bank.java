package com.expertzlab.sample3;

/**
 * Created by agnel on 5/8/18.
 */
public class Bank {
    public static void main(String[] args) {
        Account ac1 = new Account("AG123","Savings",20000);
        Account ac2 = new Account("AG124","Current",10000);
        ac1.display();
        ac2.display();

      /*  ac1.accNo="AG123";
        ac1.accType="Savings";
        ac1.balance=20000;

        ac2.accNo="AG124";
        ac2.accType="Current";
        ac2.balance=10000;*/

       // ac1.display(ac1);
        //ac2.display(ac2);

       /* System.out.println("Account No. Ac1:"+ac1.accNo);
        System.out.println("AccType Ac1:"+ac1.accType);
        System.out.println("Balance Ac1:"+ac1.balance);

        System.out.println("Account No. Ac2:"+ac2.accNo);
        System.out.println("AccType Ac2:"+ac2.accType);
        System.out.println("Balance Ac2:"+ac2.balance);*/
    }
}
