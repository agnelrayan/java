package com.expertzlab.Basics.pack;

import com.expertzlab.Basics.Accounts;

/**
 * Created by agnel on 5/4/18.
 */
public class AccountManager {
    public static void main(String[] args) {
        Accounts ac1 = new Accounts(10000);
        SavingsAccounts sa1 = new SavingsAccounts(20000);
        CurrentAccount ca1 = new CurrentAccount(30000);
        ac1 = sa1;

    }
}
