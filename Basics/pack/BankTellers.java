package com.expertzlab.Basics.pack;

import com.expertzlab.Basics.Accounts;

/**
 * Created by agnel on 5/4/18.
 */
class BankTellers {
    public static void main(String[] args) {
        Accounts a1 = new Accounts(10000);

        a1.credit(1000);
        a1.debit(1000);
        float f =a1.getBalance();
        System.out.println("Get Balance:"+f);

    }
}
