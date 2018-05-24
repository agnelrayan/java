package com.expertzlab.polymorphism;

public class MethodOverrideex{

    public static void main(String args[]) {
       // Company a = new Company(); // Company reference and object
        Company b = new eBay(); // Company reference but eBay object

       // a.address();// runs the method in Company class
        b.address();// Runs the method in eBay class
        //int i=b.companyid=100;
        //System.out.println(i);
    }
}

class Company {

    int companyid=1;
    public void address()
    {
        System.out.println("This is Address of ExpertzLab Company...");
        System.out.println("Company Id"+companyid);
    }
}

class eBay extends Company {

    //int companyid=10;
    public void address()
    {
        //companyid=10;
        System.out.println("This is eBay's Address...");
        System.out.println("eBayId:"+companyid);
    }
}