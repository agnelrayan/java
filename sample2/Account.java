package com.expertzlab.sample2;

/**
 * Created by agnel on 5/5/18.
 */
public class Account {
    public String accountNo;
    public String accountType;
    public int balance;
    public static int minBalance=2000;
    public static String bankName="SBI";

    public Account(String no, String type,int bal){
        accountNo=no;
        accountType=type;
        balance=bal;

           }

      public void display(){
               System.out.println("No:"+accountNo+"Type:"+accountType+"Balance:"+balance+"Bank Name:"+bankName+"MInimum Bal:"+minBalance);
           }

          /* public int getMinBalance(){
          return minBalance;
           }*/
}
