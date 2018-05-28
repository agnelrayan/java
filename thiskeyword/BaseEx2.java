package com.expertzlab.thiskeyword;

/**
 * Created by agnel on 5/25/18.
 */
public class BaseEx2 extends SuperEx2 {
    int bookId=201;
    String bookName="Advance Java";
    String author ="Gosling";

    BaseEx2(){
        //this();
        super(301,"Hadoop","Doug");

    }

    public void display(){

        super.display();
        System.out.println("Author of Super Class:"+super.author);

        System.out.println("Book Id:"+bookId);
        System.out.println("Book Name:"+bookName);
        System.out.println("Book Author:"+author);
    }

}
