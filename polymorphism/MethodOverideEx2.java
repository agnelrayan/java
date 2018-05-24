package com.expertzlab.polymorphism;

/**
 * Created by geo on 25/9/17.
 */

class Bank{
  int getInterest(){
        return 0;
    }
}

class SBI extends Bank{
   int getInterest(){
        return 4;
    }
}
class IOB extends Bank{
    int getInterest(){
        return 6;
    }
}

class ICICI extends Bank{
    int getInterest(){
        return 8;
    }
}

public class MethodOverideEx2 {
    public static void main(String[] args) {
        Bank obj = new SBI();
        Bank obj2 = new IOB();
        Bank obj3 = new ICICI();

        int i=obj.getInterest();
        System.out.println(i);

        int j=obj2.getInterest();
        System.out.println(j);

        int k=obj3.getInterest();
        System.out.println(k);
    }
}
