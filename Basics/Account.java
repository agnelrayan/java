package com.expertzlab.Basics;


import java.util.Scanner;

public class Account {
    int acno;
    String name;
    float amount;

    void insert(int a,String n, float amt ){
        acno=a;
        name=n;
        amount=amt;
    }

    void getData(){
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter the name");
        name = obj2.nextLine();
        System.out.println("Enter the A/c No:");
        acno = obj2.nextInt();
        System.out.println("Enter the Amount");
        amount = obj2.nextFloat();


    }

    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt+":is Deposited");
    }

    void withdraw(int amt){
        if(amount<amt){
            System.out.println("Insufficient Balance");
        }
        else{
            amount=amount-amt;
            System.out.println(amt+":is Withdrawn");
        }
    }

    void transfer(int amt) {
        if (amount < amt) {
            System.out.println("You can't Transfer");
        } else {
            amount = amount - amt;
            System.out.println(amt + ":is Tranfered");
        }
    }
    void checkBalance(){
        System.out.println("Balance is:"+amount);

    }
    void display(){
        System.out.println("A/C No:"+acno+ "Name:"+name+"Amount:"+amount);
    }

    public static void main(String[] args) {
        int i;
        Account obj[] = new Account[2];
        for(i=0;i<2;i++) {
            obj[i] = new Account();
            obj[i].getData();
            obj[i].display();
            obj[i].checkBalance();
            obj[i].deposit(4000);
            obj[i].checkBalance();
            obj[i].withdraw(1000);
            obj[i].checkBalance();
            obj[i].transfer(1000);
            obj[i].checkBalance();
        }

       // obj.insert(1,"Ag",1000);
        /*for(i=0;i<2;i++)
            obj[i].getData();
        for(i=0;i<2;i++)
        obj[i].display();
        for(i=0;i<2;i++)
        obj[i].checkBalance();
        for(i=0;i<2;i++)
        obj[i].deposit(4000);
        for(i=0;i<2;i++)
        obj[i].withdraw(1000);
        for(i=0;i<2;i++)
        obj[i].checkBalance();*/

       /* System.out.println("Second Object");
        Account obj2 = new Account();
        obj2.insert(2,"Ray",50000);
        obj2.display();
        obj2.checkBalance();
        obj2.deposit(440000);
        obj2.checkBalance();*/

    }
}
