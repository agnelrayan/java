package com.expertzlab.arrays;

/**
 * Created by agnel on 6/5/18.
 */
public class ArraysOfObject {

    int acNo;
    String name;
    float amount;

    ArraysOfObject(int acNo, String name,float amount){
        this.acNo=acNo;
        this.name=name;
        this.amount=amount;
            }

            public void credit(int amt){
               amount=amount+amt;
                System.out.println("Credit:"+amount);
               //return (int) amount;
            }

            public void debit(int amt){
                amount=amount-amt;
               System.out.println("Debit:"+amount);
               // return (int) amount;

            }

            public void display(){
                System.out.println(" A/cNo : "+acNo+" Name :"+name+" Amount : "+amount);
            }

    public static void main(String[] args) {
        ArraysOfObject a[] = new ArraysOfObject[2];
        for(int i=0;i<a.length;i++){

            a[0]=new ArraysOfObject(1,"AG",20000);
            a[1]=new ArraysOfObject(2,"Ray",30000);
            a[i].credit(1000);
            a[i].debit(1000);
          //  a[1].credit(2000);
           // a[1].debit(2000);
            a[i].display();
            //a[1].display();





        }
    }
}
